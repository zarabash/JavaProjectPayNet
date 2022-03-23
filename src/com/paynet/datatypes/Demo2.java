package com.paynet.datatypes;

public class Demo2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		int result = a + b;
		
		System.out.println(result);
		
		result = a - b;
		System.out.println(result);
		
		//multiplication
		result = a * b;
		System.out.println(result);
		
		//division
		//result = a / (double)b; cannot
		double output = a / (double)b; //explicit conversion, no data lost
		System.out.println(result);

	}

}
