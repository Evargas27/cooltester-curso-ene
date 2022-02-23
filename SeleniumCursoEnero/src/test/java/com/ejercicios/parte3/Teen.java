package com.ejercicios.parte3;

public class Teen {

	public static boolean hasTeen (int x, int y, int z) {
		
		for (int i=13; i<=19; i++) {
			if (x==i || y==i || z==i) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isTeen (int x) {
		
		for (int i=13; i<=19; i++) {
			if (x==i) {
				return true;
			}
		}
		
		return false;
	}
}