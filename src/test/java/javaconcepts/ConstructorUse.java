package javaconcepts;

public class ConstructorUse {

	int a;
	int b;
	public static void main(String[] args) 
	{
			ConstructorUse c= new ConstructorUse(10,15);
			
	}

	public ConstructorUse(int a, int b)
	{
//		a=10;
//		b=15;
		int c=a+b;
		System.out.println("Addition of 10 & 15 is "+c);
		System.out.println("hello friends");
	}
}
