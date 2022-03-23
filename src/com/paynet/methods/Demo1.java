package com.paynet.methods;

public class Demo1 {
	
	public static void main(String[] args) {
		int radius = 10;
		
		//double result = 3.14*radius*radius;
		//System.out.println(result);
		
		double result = Area.areaOfCircle(radius);
		System.out.println(result);
		
		result = Area.areaOfRectangle(10, 20);
		System.out.println(result);

		//result = Area.areaOfTriangle(10, 25);
		//System.out.println(result);
		
		String name = Area.getAuthorName();
		
		Area obj = new Area(); //to call non static method create obj. this allocate the memory
		
		result = obj.areaOfTriangle(25, 1);
		System.out.println(result);
		
		System.out.println(obj.areaOfTriangle(25, 1));
	}

}
