package modifier.Method;

//The method is only accessible within the declared class

public class Private {

	public static void main(String[] args) 
	{
		Data object = new Data();
		
		//private method can not be access outside the class...
		/*object.name();*/
		System.out.println(object);
		

	}

}

class Data
{   
	
	static
	{
		Data object = new Data();
		object.name();
	}
	
	//private method can not be access outside the class...
	private void name()
	{
		System.out.println("name is granthik..");
	}

}