package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {3,2,11,4,6,7};
		System.out.println("Array1: "+Arrays.toString(a1));
		int[] a2 = {1,2,8,4,9,7};		
		System.out.println("Array2: "+Arrays.toString(a2));
		System.out.print("Intersections are: ");
		for (int i = 0; i < a1.length; i++) {			
			for (int j = 0; j < a2.length; j++) {				
				if (a1[i] == a2[j]) {					
					System.out.print(" "+a1[i]);					
					break;	
				}
			}
		}
	}

}
