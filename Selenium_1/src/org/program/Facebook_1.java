package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement elm = driver.findElement(By.id("email"));
		elm.sendKeys("sachin10@gmail.com");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("000123123");
		
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
		
	}

}