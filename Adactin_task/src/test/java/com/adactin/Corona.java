package com.adactin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Corona {
	static WebDriver driver;
	public static int indexofpopulation;
	public static int indexofcountry;
	
	private static void browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");

	}
	private static void Covid() {
		driver.get("https://www.worldometers.info/coronavirus/");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));
		for (WebElement webElement : alldata) {
			System.out.println(webElement.getText());
		}
		
		
	}
	private static void getParticular() {
		WebElement particularvalue = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]"));
		System.out.println(particularvalue.getText());

	}
	private static void Countrylist() {
		WebElement Listofcountries = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td[2]"));
		System.out.println(Listofcountries.getText());
	}
	private static void getallHeader() {
	    Map<Integer, String> headerMap = new LinkedHashMap<Integer, String>();
	    List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead"));
	    for (int i = 0; i < allHeaders.size(); i++) {
	    	String header = allHeaders.get(i).getText().replace("\n", "");
	    	headerMap.put(i, header);
	    	if (header.equalsIgnoreCase("population")) {
	    		indexofpopulation=i;
				}else if (header.contains("Country")) {
					indexofcountry=i;
					}
	    	System.out.println(headerMap);
			
		}

	}

	
	public static void main(String[] args) {
		browser();
		//Covid();
		//getParticular();
		//Countrylist();
		getallHeader();
		
	}

}
