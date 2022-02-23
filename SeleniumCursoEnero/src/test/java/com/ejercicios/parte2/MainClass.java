package com.ejercicios.parte2;

public class MainClass {

	public static void main(String[] args) {
		
		//Invocación a BarkingDog
		System.out.println(BarkingDog.shouldWakeUp(true, -7)? "WAKE UP, THE DOG IS BARKING!!!":"YOU CAN KEEP SLEEPING");
		
		//Invocación a Cat
		System.out.println(Cat.isCatPlaying(true, 46)? "THE CAT IS PLAYING":"THE CAT IS NOT PLAYING");
		
		//Invocación a CocheVelocidad
		System.out.println(CocheVelocidad.validarVelocidad(40, 3));	
		
		//Invocación a MegaBytes
		MegaBytes.printMegaBytesAndKiloBytes(5000);
		
		//Invocación a clases de Decimal
		System.out.println(Decimal.areEqualByThreeDecimalPlaces(-3.123, 3.123) ? "Los números son iguales DECIMAL1" : "Los números no son iguales");
		
		//Invocación a VerificadorNumeros
		VerificadorNumeros.imprimirVerificadorNumeros(1, 3, 3);	
		
		//Invocación a SumOdd
		System.out.println("El resultado es "+ SumOdd.sumOdd(2,7));
		
		//Invocación a VerificadorSumaNumero
		System.out.println(VerificadorSumaNumero.hasEqualSum(5, 10, 15)? "La suma del 1er y 2do número es igual al 3er número":"La suma del 1er y 2do número no es igual al 3er número");
	}
}