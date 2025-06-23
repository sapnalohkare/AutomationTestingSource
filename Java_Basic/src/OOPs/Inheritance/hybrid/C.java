package OOPs.Inheritance.hybrid;

public class C extends B
{
	public void disp()    
	{    
	System.out.println("C");    
	}

	public static void main(String[] args) 
	{
		C c_Object = new C();
		c_Object.disp();
	}
}
