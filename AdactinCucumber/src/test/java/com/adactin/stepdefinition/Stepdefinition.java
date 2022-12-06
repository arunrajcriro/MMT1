package com.adactin.stepdefinition;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	import com.adactin.runner.RunnerClass;
	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Stepdefinition {
		
		WebDriver driver= RunnerClass.driver;
		
		@Given("^userlanch the adactin application$")
		public void userlanch_the_adactin_application() throws Throwable {
		    

			driver.get("https://adactinhotelapp.com/");
		}

		@When("^user Enter the Username in Username field$")
		public void user_Enter_the_Username_in_Username_field() throws Throwable {
		  
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("RajaStark");
		}

		@When("^user Enter the password in Password field$")
		public void user_Enter_the_password_in_Password_field() throws Throwable {
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		   
		  
		}

		@Then("^user Click the Login Button and it Navigates to Search Hotel Page$")
		public void user_Click_the_Login_Button_and_it_Navigates_to_Search_Hotel_Page() throws Throwable {
		    
		    driver.findElement(By.xpath("//input[@id='login']")).click();
		}

		@When("^user select the Location from Select Location Dropdown$")
		public void user_select_the_Location_from_Select_Location_Dropdown() throws Throwable {
		   
		   WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		   
		  Select sc = new Select(location);
		  sc.selectByVisibleText("Brisbane");
		   
		}

		@When("^user select the Hotel from Select Hotel Dropdown$")
		public void user_select_the_Hotel_from_Select_Hotel_Dropdown() throws Throwable {
		   
		   WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		   
		   Select sc = new Select(hotels);
		   sc.selectByVisibleText("Hotel Sunshine");  
		}

}
