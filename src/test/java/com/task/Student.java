package com.task;

public class Student  extends Teacher  
{
	@Override
	void name() 
	{ 
		System.out.println("Student is :arun"); 
	}
	
	void id() 
    { 
	System.out.println("student id is: 007");
	 }
	
	void col() 
    { 
	System.out.println("student col is: SMIT");
	 }
	
	
	void department() 
    { 
	System.out.println("student dep is :Information Technology");
	 }
	
	
	public static void main(String[] args)
	{
	Teacher obj1 = new Teacher();
	obj1.name();
	Teacher obj2 = new Student();
	obj2.name();
	Teacher obj3 = new Teacher();
	obj3.id();
	Teacher obj4 = new Student();
	obj4.id();
	Teacher obj5 = new Teacher();
	obj5.col();
	Teacher obj6 = new Student();
	obj6.col();
	Teacher obj7 = new Teacher();
	obj7.department();
	Teacher obj8 = new Student();
	obj8.department();
	
	
	}
	 





}
