package com.paynet.variable;

public class Demo1 {

	public static int aS = 10; //static variable or class variable'
	public static int bS = 20;
	public int aNS = 10; //non static method or instance variable
	public int bNS = 20;
	
	public static void main(String[] args) {
		System.out.println(Demo1.aS);
		
		Demo1 obj = new Demo1();
		
		System.out.println(obj.aNS);
		
		Demo1 obj1 = new Demo1();
		Demo1 obj2 = new Demo1();
		
		obj1.bNS = 5000;
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
 
	}

}
