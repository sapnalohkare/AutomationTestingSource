package this_;

public class Fourth_Method_Argument {

	 //this: To Pass as an Argument in The Method
	
	
	public void method(Fourth_Method_Argument object)
	{
		System.out.println("Methd invoked..");
		
	}
	
	public void display()
	{
		method(this);
	}
	
	
	public static void main(String[] args) 
	{
		Fourth_Method_Argument object = new Fourth_Method_Argument();
		object.display();
	}

}
