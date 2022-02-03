package com.ejercicios.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un n�mero y muestra si es positivo o negativo y si es par o impar
	
		Scanner consola = new Scanner (System.in);

		System.out.println("Ingrese un n�mero: ");

		int num = consola.nextInt();

		consola.close();		
		
		if (num > 0) {
			System.out.println("El n�mero " + num + " es positivo");
		} else if (num < 0) {
			System.out.println("El n�mero " + num + " es negativo");
		} else {
			System.out.println("El n�mero " + num + " es tibio");
		}
		
		if (num % 2 == 0) {
			System.out.println("El n�mero " + num + " es par");
		} else {
			System.out.println("El n�mero " + num + " es impar");
		}
	}
}