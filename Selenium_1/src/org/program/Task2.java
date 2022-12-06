package org.program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement web = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(web);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sara");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("arun");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.navigate().to("https://www.amazon.in/");
		Actions ac = new Actions(driver);
		
		WebElement right_click = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
		ac.contextClick(right_click).build().perform();
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File scr = ss.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\arunr\\eclipse-workspace\\Selenium_1\\Driver\\Screenshot\\AmzMobiles.png");
		FileUtils.copyFile(scr, f);
	}

}
