package homework;

public class rough {

	int x;
	
	public rough(int x) 
	{
		
		this.x=x;
		
		
	}
	public rough()
	{
		System.out.println("Default constructor");
	}
	public static void main(String[] args)
	{
		String s= "Sapna";
		String name = new String();
		rough object = new rough(5);
		System.out.println(object.x+" "+name+" "+s);
		

	}

}
