package com.ejercicios.parte3;

public class NumeroDiasMes {

	public static boolean isLeapYear (int year) {
				
		if (year <=9999 && year >= 1 && year%4 == 0) {		
			if (year%100 == 0) {
				return year%400==0?true:false;
			} else {
				return true;	
			}
		}else {
			return false;
		}
	}
	
	public static int getDaysInMonth (int month, int year) {
		
		if (month >= 1 && month <= 12 && year <=9999 && year >= 1 ) {
			
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;				
			case 2:
				if (isLeapYear(year)) {
					return 29;
				} else {
					return 28;
				}
			case 4:
			case 6:
			case 9:
			case 11:	
				return 30;
			}
		} 		
		return -1;
	}
}