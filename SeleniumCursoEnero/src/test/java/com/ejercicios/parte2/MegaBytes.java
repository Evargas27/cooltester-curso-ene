package com.ejercicios.parte2;

public class MegaBytes {

	public static void printMegaBytesAndKiloBytes (int kiloBytes) {
		
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int kbPorMb = 1024;
			int megaBytes = kiloBytes / kbPorMb;
			int remaining = kiloBytes % kbPorMb;
			
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaining + " KB");
		}		
	}
}