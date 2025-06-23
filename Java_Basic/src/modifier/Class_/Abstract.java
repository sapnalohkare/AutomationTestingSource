package modifier.Class_;

//can not create object of abstract class..needs to be extend

public class Abstract extends employee
{
    
	public static void main(String[] args)
	{
		//employee obj = new employee();------error-------
		
		Abstract object = new Abstract();
		object.display();

	}
	
	void display()
	{
		super.to_String();
	}
	
	 void to_String()
		{
			System.out.println("Abstract employee class..");
		}

}


abstract class employee {

	 void to_String()
	{
		System.out.println("Abstract employee class..");
	}

}