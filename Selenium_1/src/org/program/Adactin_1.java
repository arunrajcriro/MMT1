package org.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/Register.php");
		driver.manage().window().maximize();
		WebElement elm = driver.findElement(By.xpath("//input[@id='username']"));
		elm.sendKeys("Briandom7");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("00121234@bt");
		WebElement pass1 = driver.findElement(By.xpath("//input[@name='re_password']"));
		pass1.sendKeys("00121234@bt");
		WebElement fn = driver.findElement(By.xpath("//input[@name='full_name']"));
		fn.sendKeys("Daniel Brian");
		WebElement email = driver.findElement(By.xpath("//input[@id='email_add']"));
		email.sendKeys("arunbaala12@gmail.com");
		Thread.sleep(10000);
		WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agree.click();
		WebElement reg = driver.findElement(By.xpath("//input[@type='submit']"));
		reg.click();
		
	}

}
