package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// Datos primitivos
		byte var1 = 1; //Numérico entero. Rango -28 a 127
		short var2 =1; //Numérico entero
		int var3 = 1; //Numérico entero - Automation
		long var4 = 1L; //Numérico entero - Automation
		
		float var5 = 1.2f; //Numérico real. 4 bytes
		double var6 = 1.2; //Numérico real. 8 bytes - Automation
		
		char var7 = 'a'; //Caracter
		boolean var8 = true; //Boleano - Automation - Valores: true/false
		
		// Declarar variables
		int x;
		x = 10000;
		
		// Char symbol example
		char symbol = '\u00A9';
						
		// Cadena char
		String message = "Hello world"; //String no es un dato primitivo
		
		// Imprimir en consola
		System.out.println(symbol);
		System.out.println(message);
		
		// Concatenación
		System.out.println(message+symbol);

		int numero = 1;
		String nombre = "Estephanía";
		System.out.println(nombre+numero);
	}

}
