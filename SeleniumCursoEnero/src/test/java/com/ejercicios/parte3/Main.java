package com.ejercicios.parte3;

public class Main {

	public static void main(String[] args) {

		//Invocaci�n a AnioBisiesto
		System.out.println(AnioBisiesto.isLeapYear(1976)?"El a�o es bisiesto":"El a�o no es bisiesto o no es un a�o v�lido");
		
		//Invocaci�n a AreaCalculator
		double areaC = AreaCalculator.area(25.0);//c�rculo
		double areaR = AreaCalculator.area(5.0, 4.0);//rect�ngulo
		System.out.println(areaC!=-1?"El �rea del c�rculo es: "+areaC:"Valor del radio no v�lido");
		System.out.println(areaR!=-1?"El �rea del rect�ngulo es: "+areaR:"El(Los) valor(es) no es(son) v�lido(s)");

		//Invocaci�n a NumeroDiasMes
		int diasMes = NumeroDiasMes.getDaysInMonth(1, 2020);
		System.out.println(diasMes!=-1?"El mes tiene "+diasMes+" d�as":"El(Los) valor(es) no es(son) v�lido(s)");	
		
		//Invocaci�n a Teen
		System.out.println(Teen.hasTeen(12, 13, 14)?"Hay n�meros enviados dentro del rango de 13 a 19":"NING�N n�mero de los enviados est� en el rango de 13 a 19");
		System.out.println(Teen.isTeen(13)?"El n�mero EST� en el rango de 13 a 19":"El n�mero NO EST� en el rango de 13 a 19");		

	}
}