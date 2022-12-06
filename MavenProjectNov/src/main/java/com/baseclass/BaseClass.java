package com.baseclass;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.struc.LinkedList;

import io.github.bonigarcia.wdm.WebDriverManager;

//  1. BROWSER LAUNCH
public class BaseClass {
	public static WebDriver driver;
	private WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
	}
		else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	//  2. GET URL
	private WebDriver getUrl(String url) {
		driver.get(url);
		return driver;		
	}
	//  3. NAVIGATE TO
	private void navigateTo(String newUrl) {
		driver.navigate().to(newUrl);

	}
	//  4. NAVIGATION METHODS
	private void navigationMethods() {
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	//   5. GET CURRENTURL
	private String getCurrentUrl() {
         String currentUrl = driver.getCurrentUrl();
         return currentUrl;
	}
	//   6.  GET ATTRIBUTE
	private String getAttribute(WebElement element, String type) {
		String attribute = element.getAttribute(type);
		return attribute;
	}
	//   7.  REFRESH
	private void navigatePage() {
		driver.navigate().refresh();
	}
	//   8.  CLOSE AND QUIT
	private void closeQuit() {
		driver.close();
		driver.quit();

	}
	//   9.  ALERT
	private void alert(String type,String value) {
		Alert al = driver.switchTo().alert();
		if (type.equalsIgnoreCase("ok")) {
			al.accept();
		}
		else if (type.equalsIgnoreCase("cancel")) {
			al.dismiss();
		}
		else if (type.equalsIgnoreCase("gettext")) {
			al.getText();
		}
		else if (type.equalsIgnoreCase("input")) {
			al.sendKeys(value);
		}
	
	}
	//   10.  ACTIONS
	private void actions(WebElement element1,WebElement element2,String type) {
       Actions act= new Actions(driver);
       if (type.equalsIgnoreCase("click")) { 
    	   act.click().build().perform();
      }
       else if (type.equalsIgnoreCase("double click")) {
    	   act.doubleClick().build().perform();
       }
       else if (type.equalsIgnoreCase("context click")) {
    	   act.contextClick().build().perform();
       }
       else if (type.equalsIgnoreCase("move to element")) {
    	   act.moveToElement(element2).build().perform();
       }
       else if (type.equalsIgnoreCase("drag and drop")) {
    	   act.dragAndDrop(element1, element2).build().perform();
       }
       else if (type.equalsIgnoreCase("click and hold")) {
    	   act.clickAndHold().build().perform();
       }
	}
	//   11.  FRAMES
	private void frames(WebElement element,String idOrName, int index) {
		driver.switchTo().frame(element);
		driver.switchTo().frame(idOrName);
		driver.switchTo().frame(index);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();   
	}
	//  12. ROBOT
	private void robot(int code) throws AWTException {
         Robot rbt = new Robot();
         rbt.keyPress(code);
         rbt.keyRelease(code);
	}
	//    13. WINDOW HANDLE
	private void windowHandling(String id) {
		driver.getWindowHandle();
		driver.getWindowHandles();

	}
	//    14. GET TITLE
	private String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	//   15. SCROLL UP AND DOWN
	private void scrollPage(String value) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeAsyncScript(value);
	}
	//  16. GET TEXT
	private String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	//    17.IS ENABLED
	private boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	//   18. IS DISPLAYED
	private boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	//   19. IS MULTIPLE
	private boolean isMultiple(WebElement element) {
		Select sc = new Select(element);
		boolean multiple = sc.isMultiple();
		return multiple;

	}
	//    20.CLEAR
	private void clearElement(WebElement element) {
		element.clear();
	}
	//    21. SEND KEYS
	private void sendKeys(WebElement element) {
		element.sendKeys();
	}
	//     22. CLICK
	private void clickOnElement(WebElement element) {
		element.click();
	}
	//    23. WAIT
	private void waitMethod(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	//    24. DROP DOWN
	private void dropDown(String type,WebElement element,String value) {
		Select slc = new Select(element);
		if (type.equalsIgnoreCase("SelectByValue")) {
			slc.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("SelectByIndex")) {
			int data = Integer.parseInt(value);
			slc.selectByIndex(data);
		}
		else if (type.equalsIgnoreCase("SelectByVisibleText")) {
			slc.selectByVisibleText(value);
		}
	}
	//    25. TAKE SCREENSHOT
	private void screenShot(String pathname) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File fd = ss.getScreenshotAs(OutputType.FILE);
		File pic = new File(pathname);
		
	}
	//   26. GET FIRST SELECTED OPTIONS
	private String getFirstSelectedOption(WebElement element) {
		Select sl = new Select(element);
		WebElement firstSelectedOption = sl.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}
	//   27. GET OPTIONS
	public static List<Object> getOptions(WebElement element) {
		Select sl = new Select(element);
		List<Object> data = new LinkedList<Object>();
		List<WebElement> options = sl.getOptions();
		for (WebElement getOpt : options) {
			String text = getOpt.getText();
			data.add(text);
		}
		return data;
		
	}
	//  28.  GET ALL SELECTED OPTIONS
		public static List<Object> getAllSelectedOption(WebElement element) {
		Select sl = new Select(element);
		List<Object> data = new LinkedList<Object>();
		List<WebElement> allSelectedOptions = sl.getAllSelectedOptions();
		for (WebElement allOptions : allSelectedOptions) {
			String text = allOptions.getText();
			data.add(text);
		}
		return data;

	}
	

	
	

}
