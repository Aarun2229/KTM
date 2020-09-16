package org.mystepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgHrm 
{
	WebDriver driver;

	@Given("^user is enterning OrgHRM\\.in$")
	public void user_is_enterning_OrgHRM_in() 
	{
		
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\cucumber\\newdriver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.get("https://orangehrm.uftselenium.com/symfony/web/index.php/auth/login");
	    
	}

	@When("^user is typing the userName as \"([^\"]*)\"$")
	public void user_is_typing_the_userName_as(String user) 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(user);
	   
	}

	@When("^user is typing the password as \"([^\"]*)\"$")
	public void user_is_typing_the_password_as(String pass)
	{
	    driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}

	@Then("^user is clicking the login button$")
	public void user_is_clicking_the_login_button() 
	{
		driver.findElement(By.id("btnLogin")).click();
		
		
	}

}
