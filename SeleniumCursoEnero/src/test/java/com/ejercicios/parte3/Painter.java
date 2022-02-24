package com.ejercicios.parte3;

public class Painter {

	public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {		
//		width: Represents the width of the wall.
//		height: Represents the height of the wall.
//		areaPerBucket: Represents the area that can be covered with one bucket of paint.
//		extraBuckets: Represents the bucket count that Bob has at home.
		
		if (width>0 && height>0 && areaPerBucket>0 && extraBuckets>=0) {
			
			double area = AreaCalculator.area(width, height);
			
			int bucketCount = (int)Math.ceil((area/areaPerBucket))-extraBuckets;
			
			return bucketCount;
		} else {
			return -1;
		}
	}
	
	public static int getBucketCount (double width, double height, double areaPerBucket) {		
//		width: Represents the width of the wall.
//		height: Represents the height of the wall.
//		areaPerBucket: Represents the area that can be covered with one bucket of paint.
		
		if (width>0 && height>0 && areaPerBucket>0) {
			
			double area = AreaCalculator.area(width, height);
			
			int bucketCount = (int)Math.ceil((area/areaPerBucket));
			
			return bucketCount;
		} else {
			return -1;
		}
	}
	
	public static int getBucketCount (double area, double areaPerBucket) {		
//		area: Represents the area of the wall.
//		areaPerBucket: Represents the area that can be covered with one bucket of paint.
		
		if (area>0 && areaPerBucket>0) {
					
			int bucketCount = (int)Math.ceil((area/areaPerBucket));
			
			return bucketCount;
		} else {
			return -1;
		}
	}
}