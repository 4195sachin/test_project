package javaconcepts;

public class OverloadStudy {

	public static void main(String[] args)
	{
	
	}
	
	public void name(int a, int b)
	{
		a=10; b=20;
		System.out.println(a+b);
	}
	
	public int name(int c)
	{
		c=10;
		System.out.println(c);
		
		return 1;
	}

	
}
