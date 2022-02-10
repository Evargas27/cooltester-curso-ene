package com.ejercicios.parte2;

public class Decimal {
	
	public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
		
		/*
		 * CORREGIR PARA QUE FUNCIONE CORRECTAMENTE PARA 3.17 Y 3.175
		 */
		
		String cadena1 = (String.valueOf(number1));
		String cadena2 = String.valueOf(number2);
		
		//Se obtiene la parte entera
		String entero1 = cadena1.substring(0, cadena1.indexOf('.'));
		String entero2 = cadena2.substring(0, cadena2.indexOf('.'));
		
		int i = cadena1.indexOf('.')+1;
		int j = cadena2.indexOf('.')+1;
		int contador = 0;
		
		String decimal1="";
		String decimal2="";
		
		//Se obtiene la parte decimal hasta máximo 3 decimales
		if (cadena1.length()==cadena2.length()) {
			while (i<cadena1.length() && contador<3) {
				decimal1+= cadena1.charAt(i);
				decimal2+= cadena2.charAt(j);
				i++;
				j++;
				contador++;
			}
		} else {
			while (cadena1.length() < cadena2.length()) {
				cadena1+= 0;
			}
			
			while (cadena2.length() < cadena1.length()) {
				cadena2+= 0;
			}
			
			while (i<cadena1.length() && contador<3) {
				decimal1+= cadena1.charAt(i);
				decimal2+= cadena2.charAt(j);
				i++;
				j++;
				contador++;
			}
		}
		
		//Se valida que la parte entera y la parte decimal sean iguales
		if (entero1.equals(entero2)&&decimal1.equals(decimal2)) {
			return true;		
		} else {
			return false;
		}
	}
}