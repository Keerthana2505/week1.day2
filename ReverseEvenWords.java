package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split = test.split(" ");
		int length =split.length;

		String words = new String();
		for(int i=0; i<length; i++)
		{
			if(i%2 != 0)
			{
				String reverse = split[i];
				char[] c1=reverse.toCharArray();
				char[] c2=new char[c1.length];
				int a =0;

				for(int j=c1.length-1; j>=0; j--)
				{					
					c2[a] = c1[j];
					a++;
				}
				words = String.valueOf(c2);
				split[i] = words;
			}
			else
			{
				continue;
			}
		}

		for(int i =0; i<split.length; i++)
		{
			System.out.print(split[i]+" ");
		}
		
	}
}
