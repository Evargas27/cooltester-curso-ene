package com.java;

public class Ejercicio1A {

	public static void main(String[] args) {
		/* 
		 * Crear una clase (public static void main) con tres variables de tipo double 
		 * e imprimir la suma, resta, multiplicaci�n y divisi�n de las 3 variables.
		 */
		
		double x;		
		x = 15.2;
		double y = 1.8;
		double z = 6.2;
		
		double sum;
		sum = x+y+z;
		
		double resta = x-y-z;
		double mult = x*y*z;
		double div = x/y/z;

		
		String mensajeSuma = "La suma es ";
		
		System.out.println(mensajeSuma + sum);
		System.out.println("Resta " + resta);
		System.out.println("Multiplicaci�n " + mult);
		System.out.println("Divisi�n " + div);

	}

}
