package com.ejercicios.parte1;

public class Ejercicio1 {

	public static void main(String[] args) {
		/* 
		 * Crear una clase (public static void main) con tres variables de tipo double 
		 * e imprimir la suma, resta, multiplicación y división de las 3 variables.
		 */
	
		double x = 1.5;
		double y = 2.4;
		double z = 3.2;
		
		double sum = x + y + z;
		double resta = x - y - z;
		double mult = x * y * z;
		double multRedondeo = Math.round(mult*100.0)/100.0;
		double div = x / y / z;
		double divRedondeo = Math.round(div*100.0)/100.0;
						
		System.out.println("Suma: " + x + " + " + y + " + " + z + " = " + sum);
		System.out.println("Resta: " + x + " - " + y + " - " + z + " = " + resta);
		System.out.println("Multiplicación: " + x + " * " + y + " * " + z + " = " + multRedondeo);
		System.out.println("División: " + x + " / " + y + " / " + z + " = " + divRedondeo);		
	}
}