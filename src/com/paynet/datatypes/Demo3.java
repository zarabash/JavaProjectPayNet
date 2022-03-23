package com.paynet.datatypes;

public class Demo3 {
	public static void main(String[] args) {
		float a = 10.2f;
		double b = 10.5123123;
		
		a = (float)b; // double to float, might lead to data loss
		System.out.println(a);
		
		int z = 127;
		
		byte x = (byte)z;
		System.out.println(x);
	}

}
