package com.paynet.methods;

public class Area {

	public static double areaOfCircle(int r)
	{
		double area = 3.14 * r * r;
		return area;
	}
	
	public static double areaOfRectangle(double length, double width)
	{
		return length * width;
	}
	
	public double areaOfTriangle(double height, double base)
	{
		return (base * height) / 2;
	}
	
	public static String getAuthorName()
	{
		return "zara";
	}
	
	public static void printClassPurpose()
	{
		
	}
}
