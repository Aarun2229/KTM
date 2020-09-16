package org.mystepDefinitions;

import java.util.ArrayList;
import java.util.List;

public class OneDWithHeader 
{
	public static void main(String[]args)
	{
	List<ArrayList<String>> emp = new ArrayList<ArrayList<String>>();
	
	ArrayList<String> e1 = new ArrayList<String>();
	
	e1.add("arun");
	e1.add("arun@gmail.co");
	e1.add("java");
	
	ArrayList<String> e2 = new ArrayList<String>();
	e2.add("power");
	e2.add("power@gmail.com");
	e2.add("selenium");
	
	ArrayList<String> e3 = new ArrayList<String>();
	e3.add("vicky");
	e3.add("vicky@gmail.com");
	e3.add("python");
	
	
	ArrayList<String> e4 = new ArrayList<String>();
	e4.add("mohan");
	e4.add("mohan@gmail.com");
	e4.add("c++");
	
	emp.add(e1);
	emp.add(e2);
	emp.add(e3);
	emp.add(e4);
	
	ArrayList<String> x = emp.get(0);
	String s = x.get(2);
	System.out.println(s);
	
	
	
}
}