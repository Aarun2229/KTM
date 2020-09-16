package org.stepdefinition;

import org.page.PageObject;
import org.sub.Itinerary;
import org.sub.LoginPg;
import org.sub.SearchPg;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStepsNew extends BaseClass
{
	PageObject pageObject;
	LoginPg loginPg;
	SearchPg searchPg;
	Itinerary itineraryPg;
	@Given("^User is on Adactin page$")
	public void user_is_on_Adactin_page() throws Throwable 
	{
		launchBrowser();
		url("http://adactinhotelapp.com/");
		waits();
	    
	}

	@When("^User Shld enter \"([^\"]*)\",\"([^\"]*)\"$")
	public void user_Shld_enter(String user, String pass) throws Throwable 
	{
		pageObject=PageObject.getInstance();
		loginPg=pageObject.getLoginPg();
		loginPg.login(user, pass);
	    
	}

	@When("^Click Booked itinery$")
	public void click_Booked_itinery() throws Throwable 
	{
		pageObject=PageObject.getInstance();
		searchPg=pageObject.getSearchPg();
		searchPg.search();
		
	    
	}

	@When("^User enter \"([^\"]*)\" click go, click radio button ,click cancel$")
	public void user_enter_click_go_click_radio_button_click_cancel(String booking) throws Throwable 
	{
		pageObject=PageObject.getInstance();
		itineraryPg=pageObject.getItineraryPg();
		itineraryPg.itinePg(booking);
		System.out.println();
	    
	}


}
