package com.paynet.employeetest;

import com.paynet.employee.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee.companyName = "PayNet";
		
		Employee emp1 = new Employee();
		
		emp1.empId = 101;
		emp1.empName = "John";
		emp1.empSalary = 8000;
		
		Employee emp2 = new Employee();
		
		emp2.empId = 102;
		emp2.empName = "Peter";
		emp2.empSalary = 5000;
		
		Employee emp3 = Employee.getEmployeeInstance();
		
		//System.out.println(emp1.empId);
		//System.out.println(emp1.empName);
		//System.out.println(emp1.empSalary);
		//System.out.println(Employee.companyName);
		
		//System.out.println(emp2.empId);
		//System.out.println(emp2.empName);
		//System.out.println(emp2.empSalary);
		//System.out.println(emp2.companyName);
		
		emp1.printEmployeeDetails();
		emp2.printEmployeeDetails();
		emp3.printEmployeeDetails();

	}
	
	
}
