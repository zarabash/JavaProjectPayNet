package com.paynet.logics;

public class Demo1 {

	public static void main(String[] args) {
		
		int num = -20;
		
		System.out.println(num>20);
		
		if(num > 0)
		{
			System.out.println("The given number is positive " + num);
		}
		else if(num == 0) 
		{
			System.out.println("The given number is zero");
		}
		else
		{
			System.out.println("The given number is negative " + num);
		}
		
		int pageNumber = 120;
		
		if(pageNumber >= 100) {
			if(pageNumber<=200)
			{
				System.out.println("Yes! Its between 100 and 200");
			}
		}

		if(pageNumber>=100 && pageNumber <=200)
		{
			System.out.println("Yes! its between 100 and 200");
		}
	}

}
