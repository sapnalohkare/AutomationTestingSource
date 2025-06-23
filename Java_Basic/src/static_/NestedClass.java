package static_;

public class NestedClass {

	
	
	public static void main(String[] args)
	{
		Outer.InnerNestedClass innerClassObject = new Outer.InnerNestedClass();
		innerClassObject.display();
	}
	

}

class Outer
{
	static String name ="Automation";
	static private  int salary = 30000;
	String company ="Fujitsu";
	
	
	static class InnerNestedClass
	{
		
		public void display()
		{
			
			System.out.println("static variable : name : "+name);
			System.out.println("private variable : salary : "+salary);
			System.out.println("instance variable : company : "+new Outer().company);
		}
	}

}
