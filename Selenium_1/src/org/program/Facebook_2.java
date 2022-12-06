package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement elm = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		elm.click();
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("sara");
		WebElement sn = driver.findElement(By.xpath("//input[@name='lastname']"));
		sn.sendKeys("tendulkar");
		WebElement mn = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		mn.sendKeys("000123412");
		WebElement pass = driver.findElement(By.xpath("//input[@data-type='password']"));
		pass.sendKeys("arun@sara10");
		
		WebElement drop = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(drop);
		s.selectByValue("10");
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(drop2);
		s2.selectByVisibleText("Apr");
		WebElement drop3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(drop3);
		s3.selectByValue("2000");
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
	}

}
