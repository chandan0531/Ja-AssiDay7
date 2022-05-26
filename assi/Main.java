package com.assi;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.name = "Sheela";
		emp.age = 27;
		emp.phone = "123456789";
		emp.addres = "xyz";
		System.out.println("Name of Employee : " + emp.name);
		System.out.println("Age of Employee : " + emp.age);
		System.out.println( "Phone NO. of Employee : " + emp.phone);
		System.out.println( "Address of Employee : " + emp.addres);
		emp.printSalary(40000);
	
		System.out.println("===========");
	// For manager details.	
		Manager mng = new Manager();
		mng.name = "Muni";
		mng.age = 35;
		mng.phone = "987654321";
		mng.addres = "abc";
		System.out.println("Name of Manager : " + mng.name);
		System.out.println("Age of Manager : " + mng.age);
		System.out.println( "Phone NO. of Manager : " + mng.phone);
		System.out.println( "Address of Manager : " + mng.addres);
		mng.printSalary(90000);
		
		
	}
}
