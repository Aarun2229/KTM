package com.task;

public class ChainSuper extends Chain
{
	ChainSuper()
	{
	System.out.println("No-argument constructor " +
	"of derived");
	}
	ChainSuper(String name)
	{
	super(name);
	System.out.println("Calling parameterized " +
	"constructor of derived");
	}
	public static void main(String args[])
	{
		ChainSuper obj = new ChainSuper("test");
	}

}
