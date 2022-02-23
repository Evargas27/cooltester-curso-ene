package com.ejercicios.parte2;

public class MainClass {

	public static void main(String[] args) {
		
		//Invocaci�n a BarkingDog
		System.out.println(BarkingDog.shouldWakeUp(true, -7)? "WAKE UP, THE DOG IS BARKING!!!":"YOU CAN KEEP SLEEPING");
		
		//Invocaci�n a Cat
		System.out.println(Cat.isCatPlaying(true, 46)? "THE CAT IS PLAYING":"THE CAT IS NOT PLAYING");
		
		//Invocaci�n a CocheVelocidad
		System.out.println(CocheVelocidad.validarVelocidad(40, 3));	
		
		//Invocaci�n a MegaBytes
		MegaBytes.printMegaBytesAndKiloBytes(5000);
		
		//Invocaci�n a clases de Decimal
		System.out.println(Decimal.areEqualByThreeDecimalPlaces(-3.123, 3.123) ? "Los n�meros son iguales DECIMAL1" : "Los n�meros no son iguales");
		
		//Invocaci�n a VerificadorNumeros
		VerificadorNumeros.imprimirVerificadorNumeros(1, 3, 3);	
		
		//Invocaci�n a SumOdd
		System.out.println("El resultado es "+ SumOdd.sumOdd(2,7));
		
		//Invocaci�n a VerificadorSumaNumero
		System.out.println(VerificadorSumaNumero.hasEqualSum(5, 10, 15)? "La suma del 1er y 2do n�mero es igual al 3er n�mero":"La suma del 1er y 2do n�mero no es igual al 3er n�mero");
	}
}