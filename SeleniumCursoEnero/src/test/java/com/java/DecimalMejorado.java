package com.java;

public class DecimalMejorado {

	public static boolean areEqualByThreeDecimalPlaces (double number1, double number2) {
			
		/*
		 * ORGANIZAR PARA QUITAR EL CONCATENADO CON LOS CEROS
		 */
	
		String cadena1 = (String.valueOf(number1));
		String cadena2 = String.valueOf(number2);
		
		//Se obtiene la parte entera
		String entero1 = cadena1.substring(0, cadena1.indexOf('.'));
		String entero2 = cadena1.substring(0, cadena2.indexOf('.'));
		
		int i = cadena1.indexOf('.')+1;
		int j = cadena2.indexOf('.')+1;
		
		//Se obtiene la parte decimal hasta máximo 3 decimales
		String decimal1=cadena1.concat("00").substring(i, i+3);
		String decimal2=cadena2.concat("00").substring(j, j+3);
				
		//Se valida que la parte entera y la parte decimal sean iguales
		if (entero1.equals(entero2)&&decimal1.equals(decimal2)) {
			return true;		
		} else {
			return false;
		}
	}	
}