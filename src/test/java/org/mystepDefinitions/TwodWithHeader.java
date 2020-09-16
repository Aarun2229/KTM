package org.mystepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TwodWithHeader 
{
	WebDriver driver;
	@Given("^Procedure for Login page$")
	public void procedure_for_Login_page() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\cucumber\\newdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://orangehrm.uftselenium.com/symfony/web/index.php/auth/login");
	    
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String userName, String password) 
	{
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^click button$")
	public void click_button() 
	{
	   
	}

}
