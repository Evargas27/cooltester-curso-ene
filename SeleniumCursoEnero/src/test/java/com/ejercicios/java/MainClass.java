package com.ejercicios.java;

public class MainClass {

	public static void main(String[] args) {
		
		//Invocación a BarkingDog
		System.out.println(BarkingDog.shouldWakeUp(false, 7)? "WAKE UP, THE DOG IS BARKING!!!":"YOU CAN KEEP SLEEPING");
		
		//Invocación a Cat
		System.out.println(Cat.isCatPlaying(true, 10)? "THE CAT IS PLAYING":"THE CAT IS NOT PLAYING");
		
		//Invocación a CocheVelocidad
		System.out.println(CocheVelocidad.validarVelocidad(60, 2));		
	}
}