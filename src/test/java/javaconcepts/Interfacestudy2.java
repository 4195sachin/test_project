package javaconcepts;

public class Interfacestudy2 implements InterfaceStudy1,InterfaceStudy
{
		 
	
	public void name() 
	{
		System.out.println("My name is pravin");
		
	}
	public void students() 
	{

		System.out.println("i am a student");
	}
	public static void main(String[] args) 
	{
		
		Interfacestudy2 is2 = new Interfacestudy2();
		is2.name();
		is2.students();
		is2.name1();
		is2.students1();
		
	
	}
	public void name1() {
		System.out.println("my name is pravin chikane");
		
	}
	public void students1() {
		System.out.println("i am university student");
		
	}
}
