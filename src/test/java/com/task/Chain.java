package com.task;

public class Chain 
{

String name;
Chain()
{
this("");
System.out.println("No-argument constructor of" +" base class");
}
Chain(String name)
{
this.name = name;
System.out.println("Calling parameterized constructor"+ " of base");
}

}
