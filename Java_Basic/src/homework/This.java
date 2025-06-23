package homework;

public class This 
{
	int rollNo;
	String name;
	Float fees;
	
	public This(int rollNo,String name,Float fees)
	{
		//1)this can be used to refer current class instance variable.
		this.rollNo= rollNo;
		this.name = name;
		this.fees = fees;
		
	   
		this.display();
		System.out.println("2)this can be used to invoke current class method (implicitly)");
		
	}
	
	public This()
	{
		
		System.out.println("Default constructor..");
	}
	
	public This(String name)
	{
		
		this();
		
	}
	
	public void display()
	{
		
		System.out.println("[ "+rollNo+" "+name+" "+fees+" ]");
	}
	
	
	public void object_Method(This object)
	{
		System.out.println("Method invoked");
		
	}
	public void run()
	{  
		
		object_Method(this);
	}
	
	public This return_Obj()
		{
		
		System.out.println("*** "+rollNo+" "+name+" "+fees+" ***");
				return this;
		}
		
	
	public static void main(String[] args) 
	{
		System.out.println("1) this can be used to refer current class instance variable.");
		This object = new This(4,"Evanshi",7000.9f);
		
		System.out.println("\n"+"3) this() can be used to invoke current class constructor...");
		This object_2 = new This("Shahameer");
		
		System.out.println("4) this: To Pass as an Argument in The Method");
		object_2.run();
		
		System.out.println("5) this Keyword Can Be Used To Return the Current Class Instance");
		object.return_Obj();
		
	}
	
	
	

}
