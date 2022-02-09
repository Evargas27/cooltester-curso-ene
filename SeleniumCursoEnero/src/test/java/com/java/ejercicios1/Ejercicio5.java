package com.java.ejercicios1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar
		 */
	
		Scanner consola = new Scanner (System.in);

		System.out.println("Ingrese un número: ");

		int num = consola.nextInt();

		consola.close();		
		
		/*
		 * OPCIÓN 1
		 */		
//		if (num > 0) {
//			System.out.println("El número " + num + " es positivo");
//		} else if (num < 0) {
//			System.out.println("El número " + num + " es negativo");
//		} else {
//			System.out.println("El número " + num + " es neutro");
//		}
//		
//		if (num % 2 == 0) {
//			System.out.println("El número " + num + " es par");
//		} else {
//			System.out.println("El número " + num + " es impar");
//		}
		
		/*
		 * OPCIÓN 2
		 */		
		if (num % 2 == 0) {
			if (num > 0) {
				System.out.println("El número " + num + " es positivo y par");
			} else if (num < 0) {
				System.out.println("El número " + num + " es negativo y par");
			}
			else {
				System.out.println("El número " + num + " es neutro y par");
			}
		} else if (num > 0) {
			System.out.println("El número " + num + " es positivo e impar");
		} else {
			System.out.println("El número " + num + " es negativo e impar");
		}		
	}
}