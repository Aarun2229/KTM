package com.task;

public abstract class Shape 
{
	
	 String colorOfShape;
	  abstract double areaOfShape();
	  public abstract String toString();
	  public Shape(String colorOfShape)
	  {
	    System.out.println("Constructor of Shape class called");
	    this.colorOfShape = colorOfShape;
	  }
	  public String getColorOfShape()
	  {
	    return colorOfShape;
	  }

	
	
}
