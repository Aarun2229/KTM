package org.mystepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OrgHrmWithHeader
{
	WebDriver driver;
	
	@Given("^welcome to LoginPage$")
	public void welcome_to_LoginPage()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\cucumber\\newdriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://orangehrm.uftselenium.com/symfony/web/index.php/auth/login");
      
		
	}

	@When("^plz enter the below credintials$")
	public void plz_enter_the_below_credintials(DataTable data) 
	{
		List<Map<String,String>> keyValuePair =  data.asMaps(String.class, String.class);
		String user = keyValuePair.get(0).get("userName");
		String pass = keyValuePair.get(0).get("Password");
		driver.findElement(By.id("txtUsername")).sendKeys(user);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	    
	}


}
