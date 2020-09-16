package org.mystepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenGoogleDefinition
{
	WebDriver driver;
	
	@Given("^user is entering the google\\.co\\.in$")
	public void user_is_entering_the_google_co_in()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\cucumber\\newdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		
	}

	@When("^user is typing the search term \"([^\"]*)\"$")
	public void user_is_typing_the_search_term(String searchtearm) 
	{
	    driver.findElement(By.name("q")).sendKeys(searchtearm);
	}

	@When("^enter the return key$")
	public void enter_the_return_key()
	{
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("^the user should see the search results$")
	public void the_user_should_see_the_search_results() 
	{
		boolean status = driver.findElement(By.partialLinkText("aru")).isDisplayed();
		if(status)
		{
			System.out.println("Result Displayed");
		}
	}
		


}
