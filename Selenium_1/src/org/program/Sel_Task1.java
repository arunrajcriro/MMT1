package org.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Task1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com/");
		
		String currenturl2 = driver.getCurrentUrl();
		System.out.println(currenturl2);
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.close();
		}

}
