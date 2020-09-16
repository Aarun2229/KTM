package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dummy 
{
	@Given("^User is on the facebook page$")
	public void userIsOnTheFacebookPage() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\MavenProjectP\\chromedriver\\chromedriver.exe"); 

		WebDriver driver = new ChromeDriver(); 

		driver.get("http://www.facebook.com/"); 

		driver.manage().window().maximize(); 
	}

	@When("^User enters \"([^\"]*)\" , \"([^\"]*)\"$")
	public void userEnters(String userName, String password) 
	{
		
	}

	@Then("^User should click the login button$")
	public void userShouldClickTheLoginButton() 
	{
	    
	}



}
