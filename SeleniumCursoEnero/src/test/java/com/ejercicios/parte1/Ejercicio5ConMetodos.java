package com.ejercicios.parte1;

import java.util.Scanner;

public class Ejercicio5ConMetodos {

	public static void main(String[] args) {
		/*
		 * Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar
		 */
	
		Scanner consola = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int num = consola.nextInt();
		consola.close();
				
		System.out.println("El número " +num +" es" + validarSigno(num) + validarPar(num));
	}
	
	private static String validarSigno(int num) {
		if (num == 0) {
			return " neutro";
		} else if (num > 0) {
			return " positivo";
		} else {
			return " negativo";
		}
	}

	public static String validarPar(int num) {
		return num % 2 == 0 ? " y par" : " e impar ";
	}
}