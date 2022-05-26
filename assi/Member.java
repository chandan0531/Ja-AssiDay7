package com.assi;

public class Member {
	String name;
	int age;
	String phone;
	String addres;
	double salary;
	
	public void printSalary(double salary) {
		System.out.println("Salary : " + salary);
	}
}

class Employee extends Member{
	
	String Specialisation;
	String Department;
	
}

class Manager extends Member{
	
	String Specialisation;
	String Department;
	
}