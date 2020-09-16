package org.mystepDefinitions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TwoDWithHead 
{
	public static void main(String[]args)
	{
	List<LinkedHashMap<String,String>> emp = new ArrayList<LinkedHashMap<String,String>>();
	
	LinkedHashMap<String,String> e1 = new LinkedHashMap<String,String>();
	e1.put("name", "arun");
	e1.put("email", "arun@gmail.com");
	e1.put("course", "java");
	
	LinkedHashMap<String,String> e2 = new LinkedHashMap<String,String>();
	e2.put("name", "power");
	e2.put("email", "power@gmail.com");
	e2.put("course", "python");
	
	
	LinkedHashMap<String,String> e3 = new LinkedHashMap<String,String>();
	e3.put("name", "mohan");
	e3.put("email", "mohan@gmail.com");
	e3.put("course", "selenium");
	
	
	LinkedHashMap<String,String> e4 = new LinkedHashMap<String,String>();
	e4.put("name", "vicky");
	e4.put("email", "vicky@gmail.com");
	e4.put("course", "c++");
	
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	
	LinkedHashMap<String,String> m = emp.get(0);
	String s = m.get("course");
	System.out.println(s);
	
	


}
}