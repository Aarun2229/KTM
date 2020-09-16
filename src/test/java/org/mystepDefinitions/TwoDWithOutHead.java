package org.mystepDefinitions;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoDWithOutHead 
{
	public static void main(String[]args)
	{
		Map<String,String> emp = new LinkedHashMap<String,String>();
		emp.put("name", "Arun");
		emp.put("email", "arunuvan@gmail.com");
		emp.put("course", "appium");
		
		String s = emp.get("email");
		System.out.println(s);
	}

}
