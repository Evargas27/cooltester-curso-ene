package com.ejercicios.java;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declara 2 variables numéricas enteras (con el valor que desees), e indica cual es mayor de los dos. 
		// Si son iguales indicarlo también. Vas cambiando los valores para comprobar que funciona.

		int x = 19587458;
		int y = 45877447;
		
		if (x < y) {
			System.out.println("X" + "(" + x + ")" + " es menor que " + "Y" + "(" + y + ")");
		} else if (x > y) {
			System.out.println("X" + "(" + x + ")" + " es mayor que " + "Y" + "(" + y + ")");			
		} else {
			System.out.println("X" + "(" + x + ")" + " y " + "Y" + "(" + y + ")" + " son iguales");
		}			
	}
}