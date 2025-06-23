package java_concept;

public class This_Keywoord
{

		  /*1) this can be used to refer current class instance variable.
			2) this can be used to invoke current class method (implicitly)
			3) this() can be used to invoke current class constructor.
			4) this can be passed as an argument in the method call.
			5) this can be passed as argument in the constructor call.
			6) this can be used to return the current class instance from the method.*/
	int rollNo ;
	String name;
	float fees;
	
	//***************************************1)this can be used to refer current class instance variable*******************************************
	This_Keywoord(int rollNo, String name,float fees) //these are same thats why this keyword is required else its not needed
	{
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
		
	};
	public void display()
	{
	
		System.out.println(rollNo +" "+name +" "+fees);
	};
	
	public static void main(String[] args)
	{
		
		This_Keywoord object = new This_Keywoord(45, "Shameer", 70000);
		object.m();

		
		// TODO Auto-generated method stub
		This_Keywoord obj = new This_Keywoord(32,"Manda Patil",23000);
		This_Keywoord onj2 = new This_Keywoord(56,"sapna lohkare",34000);
		
		obj.display();
		onj2.display();
		
	}
	
	
	/*********************************2 ) this can be used to invoke current class method (implicitly)**********************/
	void m()
	{
		System.out.println("Calling m method");
		this.n();
	}
	
	void n()
	{
		System.out.println("Calling n method");
	}

}
