package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.page.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features="myfeatureFiles/OpenGoogle.feature",
                 glue= {"org.mystepDefinitions"},
                 dryRun = false,
                 monochrome=true,
                 plugin= {"pretty","json:src\\test\\resources\\"
                 		+ "MyReporting\\mycucumber.json" },strict = true
                 
		           )

public class RunnerClass 
{
	
	@AfterClass
	public static void afterClass()
	{
		JVMReport.generateJVMReport(System.getProperty("user.dir") 
				+ "\\src\\test\\resources\\MyReporting\\mycucumber.json");
	}
	

}
