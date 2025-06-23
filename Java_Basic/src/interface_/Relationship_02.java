package interface_;

// multiple inheritance 


public class Relationship_02 implements IT, HR 
{

	public static void main(String[] args) 
	{
		Relationship_02 relationship = new Relationship_02();
		
		System.out.println("---------2 ways to access variable of interface HR-----");
		// two ways to access variable of HR interface
		System.out.println("salary : "+HR.Salary );
		System.out.println("salary : "+relationship.Salary );
		
		System.out.println();
		
		System.out.println("---------2 ways to access variable of interface IT-----");
		// two ways to access variable of IT interface
		System.out.println("salary : "+IT.name );
		System.out.println("salary : "+relationship.name );
		
		System.out.println();
		
		
		System.out.println("--------method calling--------");
		relationship.break_();
		relationship.hike();
		
		System.out.println();
		
		System.out.println("--------static interface method calling--------");
		IT.work();
		HR.fire();

	}

	@Override
	public void hike() 
	{
		System.out.println( "Relationship_02 : hike method ..");
		
	}

	@Override
	public void break_() 
	{
		System.out.println( "Relationship_02 : break_ method ..");
		
	}

	

}

interface HR
{
	public static final int Salary = 80000;
	
    public abstract void hike(); /*public abstract */
	
	public static void  fire()
	{
		System.out.println("HR fires ....");
	}
	
	

	
}

interface IT
{
	public static final String name = "Amdoc";
	
	public abstract void break_(); /*public abstract */
	
	public static void  work()
	{
		System.out.println("working in IT ....");
	}
	
}


