package com.ejercicios.parte3;

public class Main {

	public static void main(String[] args) {

//		System.out.println(AnioBisiesto.isLeapYear(1976)?"El a�o es bisiesto":"El a�o no es bisiesto o no es un a�o v�lido");
//		
//		System.out.println("El �rea del c�rculo es: "+AreaCalculator.area(-1.0));
		
//		double areaC = AreaCalculator.area(25.0);//c�rculo
//		double areaR = AreaCalculator.area(5.0, 4.0);//rect�ngulo
//		System.out.println(areaC!=-1?"El �rea del c�rculo es: "+areaC:"Valor del radio no v�lido");
//		System.out.println(areaR!=-1?"El �rea del rect�ngulo es: "+areaR:"El(Los) valor(es) no es(son) v�lido(s)");

		int diasMes = NumeroDiasMes.getDaysInMonth(1, 2020);
		System.out.println(diasMes!=-1?"El mes tiene "+diasMes+" d�as":"El(Los) valor(es) no es(son) v�lido(s)");		
	}
}