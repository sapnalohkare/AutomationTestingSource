package this_;

//5. Using ‘this’ keyword to invoke the current class method 

public class Usage_5 
{
 
	public void display()
	{
		this.show();
		System.out.println("Inside display method...");
	}
	
	
	public void show()
	{
		System.out.println("Inside show method...");
	}
	
	
	public static void main(String[] args)
    {
		Usage_5 object = new Usage_5();
		object.display();

	}

	
	
}
