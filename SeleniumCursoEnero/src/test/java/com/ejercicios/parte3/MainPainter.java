package com.ejercicios.parte3;

public class MainPainter {

	public static void main(String[] args) {
		
//		int bucketCount = Painter.getBucketCount(-3.4, 2.1, 1.5, 2);
//		int bucketCount = Painter.getBucketCount(3.4, 2.1, 1.5, 2);
//		int bucketCount = Painter.getBucketCount(2.75, 3.25, 2.5, 0);
		
//		int bucketCount = Painter.getBucketCount(-3.4, 2.1, 1.5);
//		int bucketCount = Painter.getBucketCount(3.4, 2.1, 1.5);
//		int bucketCount = Painter.getBucketCount(7.25, 4.3, 2.35);
		
//		int bucketCount = Painter.getBucketCount(3.4, 1.5);
//		int bucketCount = Painter.getBucketCount(6.26, 2.2);
		int bucketCount = Painter.getBucketCount(3.26, 0.75);
				
		System.out.println(bucketCount != -1 ? "Se necesitan "+bucketCount+" cubetas de pintura.":"Valores inválidos");		
	}
}