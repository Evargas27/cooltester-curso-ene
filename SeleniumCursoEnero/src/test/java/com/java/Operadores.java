package com.java;

public class Operadores {

	public static void main(String[] args) {
		// OPERATORS
		
		//operadores aritméticos
		int x = 2;
		int y = 2;
		
		int suma = x + y;
		int resta = x - y;
		int mult = x * y;
		int div = x / y;
		
		double z = 2.23;
		double a = 4.34;
		
		double mult2 = z * a;
		
		System.out.println("Esta es la suma: " + suma);
		System.out.println("Esta es la resta: " + resta);
		System.out.println("Esta es la multiplicación: " + mult);
		System.out.println("Esta es la división: " + div);
		
		System.out.println("El valor double es: " + mult2);

		//operadores unarios
		int unario1 = 2;
		int unario2 = 3;
		unario1 ++;
		--unario2;
		
		System.out.println(unario1);
		System.out.println(unario2);
		
		//operadores relacionales
//		Igual que ==
//		Diferente a !=
//		Mayor que >
//		Mayor o igual que >=
//		Menor que <
//		Menor o igual que <=
		
		int or = 2;
		int or2 = 3;
		
		if (or > or2) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		String msg = "Hello";
		String msg2 = "Hola";

		if (msg != msg2) {
			System.out.println("String TRUE");
		} else {
			System.out.println("String FALSE");
		}
		
		//operadores condicionales
//		AND &&
//		OR ||
		
		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 4;
		int oper4 = 3;

		if (oper1==oper2 && oper3==oper4) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		} else {
			System.out.println("ALGÚN VALOR ES DIFERENTE");
		}
		
		if (oper1==oper2 || oper3==oper4) {
			System.out.println("TODOS LOS VALORES SON IGUALES");
		} else {
			System.out.println("ALGÚN VALOR ES DIFERENTE");
		}
		
		
	}

}
