package com.task;

public class getInstanceMethod 
{
	public static void main(String args[])
    {
		SingleTon text1 = SingleTon.getInstance();
		SingleTon text2 = SingleTon.getInstance();
   
   System.out.println("In Upper Case : ");
   text1.str = (text1.str).toUpperCase();
   System.out.println("String from text1 is " + text1.str);
   
   System.out.println("In Lower Case : ");
   text2.str = (text2.str).toLowerCase();
   System.out.println("String from text1 is " + text2.str);
    }

}
