package homework;

public class This_C 
{

	
	int age;
	String name,course;
	Float fees;
	
	This_C(int age, String name,String course,Float fees)
	{
		//1)Use
		this();
		
		//2)Use
		this.age = age;
		this.name =name ;
		this.course = course;
		this.fees =fees ;
		
		//3)Use
		display(this);
		
		//4 use under this method
		This_C obj = retun();
		
		System.out.println(obj.name+" "+obj.course+" "+obj.age+" "+obj.fees);
	
	}
	
	public This_C retun()
	{
		
		this.name = "Shobhit";
		this.course = "Engineering";
		this.age = 56;
		this.fees = 50000.05f;
		
		
		//4)Use
		return this;
	}
	
	
	This_C()
	{
		System.out.println("User defined Constructor...");
	}
	
	private  void display(This_C object)
	{
		System.out.println(object.age+" "+object.name+" "+object.course+" "+object.fees);
		
	}
	
	public static void main(String[] args) 
	{
		This_C object = new This_C(4,"Evanshi","Nursury",40000.08f);
		
		System.out.println(object);
	    

	}


	


	

}
