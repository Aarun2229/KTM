package org.stepdefinition;

import org.page.PageObject;
import org.sub.BookPg;
import org.sub.LoginPg;
import org.sub.OrderPg;
import org.sub.SearchPg;
import org.sub.SelctPg;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseClass {
	PageObject pageObject;
	LoginPg loginPg;
	SearchPg searchPg;
	SelctPg selctPg;
	BookPg bookPg;
	OrderPg orderPg;
	
	
	@Given("^User is on the Adactin page$")
	public void user_is_on_the_Adactin_page() 
	{
		launchBrowser();
		url("http://adactinhotelapp.com/");
		waits();
	    
	}

	@When("^User should enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_should_enter(String user, String pass) 
	{
		pageObject=PageObject.getInstance();
		loginPg=pageObject.getLoginPg();
		loginPg.login(user, pass);
	    
	}

	@When("^User should enter details \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_should_enter_details(String location, String hotels, String type, String rooms, String in, String out, String adult, String child) 
	{
		pageObject=PageObject.getInstance();
		searchPg=pageObject.getSearchPg();
		searchPg.search(location, hotels, type, rooms, in, out, adult,child);
		
	}

	@When("^User Click Radio button and click Continue$")
	public void user_Click_Radio_button_and_click_Continue()  
	{
		selctPg=pageObject.getSelctPg();
		selctPg.select();
	}

	@When("^User should enter \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_should_enter(String fn, String ln, String add, String no, String type,String month,String year, String cvv) 
	{
		bookPg=pageObject.getBookPg();
		bookPg.book(fn, ln, add, no, type, month, year, cvv);   
	}

	@Then("^User Should get generated order no$")
	public void user_Should_get_generated_order_no() 
	{
		
		orderPg=pageObject.getOrderPg();
		orderPg.order(); 
	}
	
	@Given("User is on the Adactin page")
	public void user_is_on_the_Adactin_page() {
		launchBrowser();
		url("http://adactinhotelapp.com/");
		waits();
	}

	@When("User should enter {string}, {string}")
	public void user_should_enter(String user, String pass) {
		pageObject=PageObject.getInstance();
		loginPg=pageObject.getLoginPg();
		loginPg.login(user, pass);	
	}

	@When("User should enter details {string},{string}, {string}, {string}, {string}, {string},{string},{string}")
	public void user_should_enter_details(String location, String hotels, String type, String rooms, String in, String out, String adult, String child) {
			pageObject=PageObject.getInstance();
			searchPg=pageObject.getSearchPg();
			searchPg.search(location, hotels, type, rooms, in, out, adult,child);
	}

	@When("User Click Radio button and click Continue")
	public void user_Click_Radio_button_and_click_Continue() {
			selctPg=pageObject.getSelctPg();
			selctPg.select();
	}

	@When("User should enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String fn, String ln, String add, String no, String type,String month,String year, String cvv) {
		bookPg=pageObject.getBookPg();
		bookPg.book(fn, ln, add, no, type, month, year, cvv);
	}

	@Then("User Should get generated order no")
	public void user_Should_get_generated_order_no() {
		orderPg=pageObject.getOrderPg();
		orderPg.order();
	}

	

}
