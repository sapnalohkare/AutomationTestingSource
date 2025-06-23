package super_;

// to call parent class method if overlapped
public class Usage_3 extends IT {

	public void display()
	{
		
		System.out.println("Usage_3 method :");
		
	}
	
	public static void main(String[] args)
	{
	
		Usage_3 object = new Usage_3();
		object.call();
	}
	
	public void call() {
		
		super.display();
	}

}

class IT
{
	public void display()
	{
		System.out.println("IT method :");
		
	}

	


}