package com.ejercicios.parte2;

public class CocheVelocidad {

	public static String validarVelocidad (int velocidad, int tipoCalle) {
		
		/*
		 * Valores para el parámetro tipoCalle:
		 * 1 = Carretera
		 * 2 = Calle normal
		 * 3 = Zona escolar
		 */
		
		int limiteCarretera = 80;
		int limiteCalleNormal = 60;
		int limiteZonaEscolar = 40;
		
//SOLUCIÓN UTILIZANDO IF - ELSE
//		if (tipoCalle == 1 && velocidad <= limiteCarretera || 
//				tipoCalle == 2 && velocidad <= limiteCalleNormal || 
//				tipoCalle == 3 && velocidad <= limiteZonaEscolar) {
//			return "Felicidades ha obtenido un descuento!";
//		} else {
//			return "Lo sentimos, tiene una nueva multa por exceder el límite de velocidad";
//		}	
		
//		SOLUCIÓN UTILIZANDO SWITCH
		switch(tipoCalle) {
		case 1:
			if (velocidad <= limiteCarretera) {
				return "Felicidades ha obtenido un descuento!";
			} else {
				return "Lo sentimos, tiene una nueva multa por exceder el límite de velocidad en carretera";
			}
		case 2:
			if (velocidad <= limiteCalleNormal) {
				return "Felicidades ha obtenido un descuento!";
			} else {
				return "Lo sentimos, tiene una nueva multa por exceder el límite de velocidad en calle normal";
			}
		case 3:
			if (velocidad <= limiteZonaEscolar) {
				return "Felicidades ha obtenido un descuento!";
			} else {
				return "Lo sentimos, tiene una nueva multa por exceder el límite de velocidad en zona escolar";
			}		 
		default:
			return "No hay límite de velocidad establecido para el tipo de calle " + tipoCalle;
		}
	}
}