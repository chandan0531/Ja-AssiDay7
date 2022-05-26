package com.assi.Q4;

public class ICICIBank extends Bank {
	double rateOfInterest;
	

	@Override
	void displayDetails() {
//		super.displayDetails();
		System.out.println(branchName);
		System.out.println(ifscCode);
		System.out.println(rateOfInterest);
	}
}
