package com.task;

public class Rectangle extends Shape
{
	 double length;
	  double width; 
	  public Rectangle(String colorOfShape,double length,double width)
	  {
	    //calling Shape constructor
	    super(colorOfShape);
	    System.out.println("Constructor of Rectangle class called");
	    this.length = length;
	    this.width = width;
	  }  
	  @Override
	  double areaOfShape()
	  {
	    return length*width;
	  }
	  @Override
	  public String toString()
	  {
	    return "Rectangle color is " + super.colorOfShape +
	        " and area is : " + areaOfShape();
	  }


}
