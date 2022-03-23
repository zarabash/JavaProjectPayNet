package com.paynet.datatypes;

public class Demo5 {

	public static void main(String[] args) {
		//5 students mark - 10,20,30,40,50
		
		int[] numbers = new int[5]; //5*32 bits of memory
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers);
		System.out.println(numbers[4]);
		
		//create an array to store - red, green, yellow
		
		String[] colors = new String[3];
		colors[0] = "red";
		colors[1] = "green";
		colors[2] = "yellow";
		
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
	}

}
