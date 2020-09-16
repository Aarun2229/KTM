package org.mystepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrgHrmDataTabWithOutHeader 
{
	WebDriver driver;
	@Given("^you are in the login page$")
	public void you_are_in_the_login_page() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\cucumber\\newdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://orangehrm.uftselenium.com/symfony/web/index.php/auth/login");
      
	}

	@When("^you enetr the below credintials$")
	public void you_enetr_the_below_credintials(DataTable data) 
	{
		List<String> credentials = data.asList(String.class);
		String userName = credentials.get(0);
		String password = credentials.get(1);
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	    
	}

	@When("^click the login button$")
	public void click_the_login_button() 
	{
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^you shld see thelogin page$")
	public void you_shld_see_thelogin_page() 
	{
		
	}

}
