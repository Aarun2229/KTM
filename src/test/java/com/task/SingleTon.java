package com.task;

public class SingleTon 
{
	 private static SingleTon e = null;
	    public String str;
	    private SingleTon()
	      {
	     str = "HHHHHiiii TTTTTTThisssss Issss AAAAAAAAAArunnnnn";
	    }
	    public static SingleTon getInstance()
	    {
	     if (e == null)
	     e = new SingleTon();
	     return e;
	    }

}
