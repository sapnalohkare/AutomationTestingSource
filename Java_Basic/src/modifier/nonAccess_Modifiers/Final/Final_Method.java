package modifier.nonAccess_Modifiers.Final;

public final class Final_Method extends Final_Method_Demo {

	
	
	public static void main(String[] args)
	{
		Final_Method object = new Final_Method();
		System.out.println(object);
		
		
	}

	
	/*------------------final method can not be overridden--------------------*/
	/*public final void finalMethod()
	{
		System.out.println("Final method can not be overridden....");
	}*/
	
	
	public String toString()
	{
		
		return "Method class object";
	}
}


class Final_Method_Demo 
{
	
	
	public final void finalMethod()
	{
		System.out.println("Final method can not be overridden....");
	}
  


}