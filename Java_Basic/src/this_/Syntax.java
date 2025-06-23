package this_;

public class Syntax {
	int age;
	float salary;
	String name;

	public Syntax() 
	{
		this.age= 25;
		this.name= "Evanshi";
		this.salary = 24.89f;
		
		System.out.println(this.age+" "+this.name+" "+this.salary);
		//run();
		this.run();
		

	}
	
	public Syntax(int age,float salary,String name) 
	{
		this();
		this.age= age;
		this.name= name;
		this.salary = salary;
		System.out.println(this.age+" "+this.name+" "+this.salary);
		
		
	}
	
	public void run() 
	{
		System.out.println("Run instance method....");
	}

	public static void main(String[] args)
	{
		Syntax obj = new Syntax(26,20009.09f,"Shahmeer");
		System.out.println(obj);
	}

}
