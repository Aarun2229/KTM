package org.page;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport 
{
	public static void generateJVMReport(String jsonFile)
	{
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reporting");
		Configuration configuration = new Configuration(loc,"Adactin Hotel");
		configuration.addClassifications("sprint","20");
		configuration.addClassifications("Browser","chrome");
		configuration.addClassifications("Env","UAT");
		configuration.addClassifications("OS","WIN-8");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder report = new ReportBuilder(jsonFiles,configuration);
		report.generateReports();

		
	}
	
	
	
	
	
		
	
	
	
	 
}
