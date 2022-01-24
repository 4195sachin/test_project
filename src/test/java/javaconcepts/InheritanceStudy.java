package javaconcepts;

public class InheritanceStudy extends InheritanceStudy1
{

	public static void main(String[] args) 
	{
		InheritanceStudy1 is1= new InheritanceStudy();
		son();
		father();
		
		is1.jobs();

	}	

	@Override
	public void jobs() 
	{
		System.out.println("Hi I am Pravin");
		
	}

}
