package com.ejercicios.parte3;

public class Main {

	public static void main(String[] args) {

		//Invocación a AnioBisiesto
		System.out.println(AnioBisiesto.isLeapYear(1976)?"El año es bisiesto":"El año no es bisiesto o no es un año válido");
		
		//Invocación a AreaCalculator
		double areaC = AreaCalculator.area(25.0);//círculo
		double areaR = AreaCalculator.area(5.0, 4.0);//rectángulo
		System.out.println(areaC!=-1?"El área del círculo es: "+areaC:"Valor del radio no válido");
		System.out.println(areaR!=-1?"El área del rectángulo es: "+areaR:"El(Los) valor(es) no es(son) válido(s)");

		//Invocación a NumeroDiasMes
		int diasMes = NumeroDiasMes.getDaysInMonth(1, 2020);
		System.out.println(diasMes!=-1?"El mes tiene "+diasMes+" días":"El(Los) valor(es) no es(son) válido(s)");	
		
		//Invocación a Teen
		System.out.println(Teen.hasTeen(12, 13, 14)?"Hay números enviados dentro del rango de 13 a 19":"NINGÚN número de los enviados está en el rango de 13 a 19");
		System.out.println(Teen.isTeen(13)?"El número ESTÁ en el rango de 13 a 19":"El número NO ESTÁ en el rango de 13 a 19");		

	}
}