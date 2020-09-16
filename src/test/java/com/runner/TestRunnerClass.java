package com.runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;
import org.page.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Fold", dryRun = false , monochrome = true
, plugin = {"pretty","json:src\\test\\resources\\Reporting\\cucumbernew.json"}, snippets = SnippetType.CAMELCASE)
public class TestRunnerClass 
{
	@AfterClass
	public static void afterClass()
	{
		JVMReport
	.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting\\cucumbernew.json");
		
	}
	

}

