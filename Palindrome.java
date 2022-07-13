package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mAdam";
		String rev="";

		for (int i = str.length()-1 ; i >=0 ; i--) {
			//Add the char into rev
			rev=rev+str.charAt(i);
		}
		if(str .equalsIgnoreCase(rev)) {
			System.out.println(str+" is a Palindrome");
		}
		else {
			System.out.println(str+" is not a Palindrome");
		}

	}
}
