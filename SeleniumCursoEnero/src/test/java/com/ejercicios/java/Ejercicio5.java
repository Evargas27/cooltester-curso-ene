package com.ejercicios.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar
	
		Scanner consola = new Scanner (System.in);

		System.out.println("Ingrese un número: ");

		int num = consola.nextInt();

		consola.close();		
		
		if (num > 0) {
			System.out.println("El número " + num + " es positivo");
		} else if (num < 0) {
			System.out.println("El número " + num + " es negativo");
		} else {
			System.out.println("El número " + num + " es tibio");
		}
		
		if (num % 2 == 0) {
			System.out.println("El número " + num + " es par");
		} else {
			System.out.println("El número " + num + " es impar");
		}
	}
}