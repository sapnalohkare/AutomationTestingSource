package super_;

//access parent class variable...
public class Usage_2 extends Hr{

	String name  = "granthik";
	
	
	public Usage_2()
	{
		
		System.out.println("parent name : "+super.name);
	}
	public static void main(String[] args) 
	{
		
		Usage_2 object = new Usage_2();
		System.out.println(object);
	}

}

class Hr
{
	String name  = "sapna";

}