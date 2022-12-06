package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement elm = driver.findElement(By.name("username"));
		elm.sendKeys("sara_tendulkar10");
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("arun@123");
		
		
	}

}
