package com.runner;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass  
{
	@Before(order=1)
	public void beforeScenario1()
	{
	System.out.println("before1 ");
	
	}
	@After({"@Reg"})
	public void AfterScenario1()
	{
	System.out.println("after 1");
	
	}
	@Before
	public void beforeScenario2()
	{
	System.out.println("before2 ");
	
	}
	
	@After
	public void AfterScenario2()
	{
	System.out.println("after2 ");
	
	}
	
	
	

}
