package com.task;

public class Circle extends Shape
{
	 double radiusOfCircle;
	  public Circle(String colorOfShape,double radiusOfCircle)
	  {
	    super(colorOfShape);
	    System.out.println("Constructor of Circle class called");
	    this.radiusOfCircle = radiusOfCircle;
	  }
	  @Override
	  double areaOfShape()
	  {
	    return Math.PI * Math.pow(radiusOfCircle, 2);
	  }
	  @Override
	  public String toString()
	  {
	    return "Circle color is " + super.colorOfShape +
	        " and area is : " + areaOfShape();
	  }  

}
