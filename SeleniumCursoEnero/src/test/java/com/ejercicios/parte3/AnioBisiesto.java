package com.ejercicios.parte3;

public class AnioBisiesto {

	public static boolean isLeapYear (int year) {
				
//		1. Si el a�o es uniformemente divisible por 4, vaya al paso 2. De lo contrario, vaya al paso 5.
//		2. Si el a�o es uniformemente divisible por 100, vaya al paso 3. De lo contrario, vaya al paso 4.
//		3. Si el a�o es uniformemente divisible por 400, vaya al paso 4. De lo contrario, vaya al paso 5.
//		4. El a�o es un a�o bisiesto (tiene 366 d�as).
//		5. El a�o no es un a�o bisiesto (tiene 365 d�as).
		
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