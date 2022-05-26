package com.assi2;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails(int studId,String studName,double examFee) {
		System.out.println(studId);
		System.out.println(studName);
		System.out.println(examFee);
	}
	public double payFee(double fee) {
		return fee;
	}
	public Student(int studId, String studName, double examFee) {
//		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	public Student() {
	
	}
	
	
}

class DayScholar extends Student {
	
	public double transportFee(double transportFee) {
		return transportFee;
	}
	
		
}

class Hosteller extends Student {
	double hostelFee;

//	public Hosteller(int studId, String studName, double examFee, double hostelFee) {
//		super(studId, studName, examFee);
//		this.studId = studId;
//		this.studName = studName;
//		this.examFee = examFee;
//		this.hostelFee = hostelFee;
//	}
	
	public Hosteller() {
		super();
//		this.hostelFee = hostelFee;
	}
			
}
