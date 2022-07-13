package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] c1=test.toCharArray(); //string to char array
		
		for(int i=0;i<c1.length;i++) {
			if(i%2!=0) {
				char c2 = Character.toUpperCase(c1[i]);
				c1[i] = c2;
			}
		}
		System.out.println(String.valueOf(c1));

	}

}
