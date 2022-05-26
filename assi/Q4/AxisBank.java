package com.assi.Q4;

public class AxisBank extends Bank{
	
	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println(branchName);
		System.out.println(ifscCode);
		System.out.println(rateOfInterest);
	}
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
}
