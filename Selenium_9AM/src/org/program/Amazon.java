package org.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_9AM\\Driver\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
}
}
