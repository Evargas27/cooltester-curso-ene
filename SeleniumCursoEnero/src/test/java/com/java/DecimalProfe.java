package com.java;

public class DecimalProfe {
	public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
		
		number1 = number1*1000;
		number2 = number2*1000;
		
		number1 = (int) number1;
		number2 = (int) number2;
		
		return number1==number2 ? true : false;		
	}
}