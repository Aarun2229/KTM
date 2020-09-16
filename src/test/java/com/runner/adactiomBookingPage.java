/*package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class adactiomBookingPage extends baseClass 
{
	WebDriver driver;
	loginPg lp = new loginPg();
	searchPage srch;
	selectPg slct;
	BookPg bp;
	orderPg op;;
	
	@Given("^User is in the Adactin page$")
	public void user_is_in_the_Adactin_page() throws Throwable 
	{
		launchBrowser();
		url("http://adactinhotelapp.com/");
		waits();
	    
	}

	@When("^User should enter \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_should_enter(String s1, String s2) 
	{
		lp = new loginPg();
		insert(lp.getTxtuser(),s1);
		insert(lp.getTxtpas(),s2);
	    
	}

	@When("^User shld click the login button$")
	public void user_shld_click_the_login_button() 
	{
		lp = new loginPg();
		click(lp.getBthloginr());
	}

	@Then("^Search Hotel page shld be displayed$")
	public void search_Hotel_page_shld_be_displayed() 
	{
	    
	}

	@Then("^User shld enter the \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_shld_enter_the(String location, String hotels, String type, String rooms, String in, String out, String adult) 
	{
		 srch = new searchPage();
		 
		 dropDown(srch.getLoc(),location);
		 dropDown(srch.getHotl(),hotels);
		 dropDown(srch.getType(),type);
		 dropDown(srch.getNos(),rooms);
		 insert(srch.getIn(),in);
		 insert(srch.getOut(),out);
		 dropDown(srch.getAdltnos(),adult);
		 
	}
 
	

	@Then("^User shld click the search button$")
	public void user_shld_click_the_search_button()
	{
		click(srch.getSubmt()) ;  
	}

	@Then("^then user shld click the radio button and click continue$")
	public void then_user_shld_click_the_radio_button_and_click_continue() 
	{
		slct=new selectPg();
		click(slct.getRado());
		click(slct.getCont());
	}

	@Then("^User shld enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_shld_enter(String fn, String ln, String add, String no, String type, String month, String year, String cvv) 
	{
		bp=new BookPg();
		insert(bp.getFn(),fn);
		insert(bp.getLn(),ln);
		insert(bp.getAdd(),add);
		insert(bp.getCcNum(),no);
		dropDown(bp.getCcType(),type);
		dropDown(bp.getMont(),month);
		dropDown(bp.getCvv(),cvv);
		
	}

	@Then("^User shld click book button now$")
	public void user_shld_click_book_button_now() 
	{
		driver.findElement(By.id("book_now")).click();
		{
			op=new orderPg();
			System.out.println();
			getVal(op.getOrderId());
		}
		}
	}*/
	

	 

