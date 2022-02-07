package com.ejercicios.java;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Escribe la declaraci�n m�s apropiada para cada una de las siguientes variables. El nombre de cada una indica
		 * el tipo de dato que contendr� y servir� para determinar el tipo de dato m�s adecuado en la declaraci�n de la variable.
		 * 
		 *  a) edad                                                b) c�digoPostal
		 *  c) altura                                              d) genero (valores: H: hombre, M: mujer)                   
		 *  e) nombre                                              f) n�meroDeHijos
		 *  g) iva (valores: % a aplicar)                          h) tallaCamisa (valores num�ricos)
		 *  i) peso                                                j) precio 
		 *  k) alumnoRepetidor  (valores: SI/NO)                   l) mensaje
		 *  m) letra                                               n) mayorEdad                                               
		 *  o) minutos                                             p) d�as
		 *  q) matriculaCoche                                      r) contador
		 *  s) mayorDeEdad  (valores: verdadero/falso)             t) tallaCamiseta (valores: S, L, XL...)
		 */
				
		int edad = 35;
		int codigoPostal = 630001;
		double altura = 1.57;
		char genero = 'M';
		String nombre = "Estephan�a";
		int numeroDeHijos = 1;
		double iva = 18.5;
		int tallaCamisa = 8;
		double peso = 51.2;
		int precio = 25800;
		String alumnoRepetidor = "NO";
		String mensaje = "Este es el ejercicio n�mero 3";
		char letra = 'A';
		String mayorEdad = "SI";
		int minutos = 75;
		int dias = 7;
		String matriculaCoche = "MWZ111";
		int contador = 0;
		boolean mayorDeEdad = true;
		String tallaCamiseta = "S";

		System.out.println("Edad: " + edad);
		System.out.println("Codigo postal: " + codigoPostal);
		System.out.println("Altura: " + altura);
		System.out.println("G�nero: " + genero);
		System.out.println("Nombre: " + nombre);
		System.out.println("Nro. de hijos: " + numeroDeHijos);
		System.out.println("IVA: " + iva);
		System.out.println("Talla camisa: " + tallaCamisa);
		System.out.println("Peso: " + peso);
		System.out.println("Precio: " + precio);
		System.out.println("�Alumno repetidor? " + alumnoRepetidor);
		System.out.println("Mensaje: " + mensaje);
		System.out.println("Letra: " + letra);
		System.out.println("�Mayor edad? " + mayorEdad);
		System.out.println("Minutos: " + minutos);
		System.out.println("D�as: " + dias);
		System.out.println("Placa: " + matriculaCoche);
		System.out.println("Contador: " + contador);
		System.out.println("�Mayor de edad? " + mayorDeEdad);
		System.out.println("Talla camiseta: " + tallaCamiseta);	
	}
}