package com.ejercicios.parte3;

public class Main {

	public static void main(String[] args) {

//		System.out.println(AnioBisiesto.isLeapYear(1976)?"El año es bisiesto":"El año no es bisiesto o no es un año válido");
//		
//		System.out.println("El área del círculo es: "+AreaCalculator.area(-1.0));
		
//		double areaC = AreaCalculator.area(25.0);//círculo
//		double areaR = AreaCalculator.area(5.0, 4.0);//rectángulo
//		System.out.println(areaC!=-1?"El área del círculo es: "+areaC:"Valor del radio no válido");
//		System.out.println(areaR!=-1?"El área del rectángulo es: "+areaR:"El(Los) valor(es) no es(son) válido(s)");

		int diasMes = NumeroDiasMes.getDaysInMonth(1, 2020);
		System.out.println(diasMes!=-1?"El mes tiene "+diasMes+" días":"El(Los) valor(es) no es(son) válido(s)");		
	}
}