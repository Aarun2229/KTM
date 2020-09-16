package org.myjvm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMRep 
{
	
	public static void generateJvmRep(String jsonFile)
	{
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\MyReporting");
		Configuration configuration = new Configuration(loc,"ORG HRM");
		configuration.addClassifications("sprint","20");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("Env","UAT");
		configuration.addClassifications("OS","WIN-8");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
		
	}

}
