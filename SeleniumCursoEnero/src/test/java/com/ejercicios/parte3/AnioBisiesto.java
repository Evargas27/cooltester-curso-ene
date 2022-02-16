package com.ejercicios.parte3;

public class AnioBisiesto {

	public static boolean isLeapYear (int year) {
				
//		1. Si el año es uniformemente divisible por 4, vaya al paso 2. De lo contrario, vaya al paso 5.
//		2. Si el año es uniformemente divisible por 100, vaya al paso 3. De lo contrario, vaya al paso 4.
//		3. Si el año es uniformemente divisible por 400, vaya al paso 4. De lo contrario, vaya al paso 5.
//		4. El año es un año bisiesto (tiene 366 días).
//		5. El año no es un año bisiesto (tiene 365 días).
		
		if (year <=9999 && year >= 1 && year%4 == 0) {		
			if (year%100 == 0) {
				return year%400==0?true:false;
			} else {
				return true;	
			}
		}else {
			return false;
		}
		
//		if (year <=9999 && year >= 1) {			
//			if (year%4 == 0) {
//				if (year%100 == 0) {
//					if (year%400 == 0) {
//						return true;
//					} else {
//						return false;
//					}
//				} else {
//					return true;
//				}
//			} else {
//				return false;
//			}			
//		}else {
//			return false;
//		}	
	}
}