package com.paynet.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public void printEmployeeDetails()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("--------------------------------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee emp = new Employee();
		return emp;
	}
}
