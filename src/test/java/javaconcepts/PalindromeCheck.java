package javaconcepts;

public class PalindromeCheck {

	public static void main(String[] args) 
	{
		String s= "velocity";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}

		System.out.println(s.equals(s1));
		
		// string split
//	String s2="";
	String[] o= s.split("c");
	System.out.println(o[1]);
	}

	
	
}
