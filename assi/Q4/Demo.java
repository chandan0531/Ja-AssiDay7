package com.assi.Q4;

public class Demo {
	
	public static Bank getBank(String bank) {
		if(bank=="axis")
		{
			AxisBank axis = new AxisBank();
			axis.branchName = "JharkhanAxis";
			axis.ifscCode = "Axis123";
			axis.rateOfInterest = 9.0;
			axis.displayDetails();
			axis.getCreditCard();
			return axis;
		}
		else if(bank=="icici")
		{
			ICICIBank icici = new ICICIBank();
			icici.branchName = "JharkhanICIC";
			icici.ifscCode = "IC123";
			icici.rateOfInterest = 10.0;
			icici.displayDetails();
			return icici;
		}
		else
		{
			return null;
		}
	}
	
	public static void main(String[] args) {
		Demo.getBank("axis");
		System.out.println("============");
		Demo.getBank("icici");

	}
}
