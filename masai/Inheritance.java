package com.masai;

public class Inheritance {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
//		emp.name = "shella";
//		emp.employeeId = "12345";
//		System.out.println(emp.name + " " + emp.employeeId );
		
		emp.setName("Sheela");
		System.out.println(emp.getName());
		
		emp.setPhone("123456");
		System.out.println(emp.getPhone());
	}
}


class Student{
	String name;
	String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}


class Employee extends Student{
	String employeeId;
}