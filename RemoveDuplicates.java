package week1.day2;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1"; 

		int count=0;
		int i,j;
		String[] split = text.split(" "); 
		for(i=0; i<split.length; i++ ) {
			for(j=i+1; j<split.length; j++) {
				if(split[i].equals(split[j])) {
					count++;

					if(count>1) {
						split[i]="";
					}

				}
			}

		}
		System.out.println(Arrays.toString(split));

	}
}


