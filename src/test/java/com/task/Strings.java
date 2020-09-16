package com.task;

public class Strings 
{
	public static void main(String args[])
	{ 
		String s1="Cricket"; 
		String s2="KTM";
		String s3=" Arun "; 
		String s4="";
		String s5="HHHHHiiiii GGGGudddd EEEEveeee";
		
		System.out.println("Length");
		System.out.println("string length is: "+s1.length());  
		System.out.println("string length is: "+s2.length());
		
		s1=s1.concat("IPL");
		System.out.println("Concat");
		System.out.println(s1);
		
		System.out.println("IsEmpty");
		System.out.println(s3.isEmpty());      
		System.out.println(s4.isEmpty());
		
		System.out.println("StringTrim");
		System.out.println(s3+"ride's byk");         
		System.out.println(s1.trim()+"how are you");
		
		System.out.println("StringLower");
		String s5lower=s5.toLowerCase();
		System.out.println(s5lower);
		
		System.out.println("StringUpper");
		String s5upper=s5.toUpperCase();
		System.out.println(s5upper);
		
	}
	
	

}