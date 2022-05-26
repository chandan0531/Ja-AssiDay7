package com.assi2;

public class Main {
	public static void main(String[] args) {
		
		DayScholar sch = new DayScholar();
		
		Hosteller host = new Hosteller();
		
		
		double x = sch.payFee(2000);
		System.out.println(x);
	}
}
