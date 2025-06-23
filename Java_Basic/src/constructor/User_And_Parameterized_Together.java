package constructor;

public class User_And_Parameterized_Together
{
 /* if both constructor is written then its depend on what kind of object is instantiated
  * if instantiated User defined then User defined constructor will be called
  * if instantiated Parameterized then Parameterized constructor will be called
  */
 
	
	User_And_Parameterized_Together()
	{
		System.out.println("User defined constructor..");
	}
	
	User_And_Parameterized_Together(String name)
	{
		System.out.println(" parameterized constructor .."+name);
	}
	
	
	
	public static void main(String[] args) 
	{
		User_And_Parameterized_Together object = new User_And_Parameterized_Together();
		System.out.println(object);//just to remove warning
       
		System.out.println();
		
		User_And_Parameterized_Together object_01 = new User_And_Parameterized_Together("Runavi");
		System.out.println(object_01);//just to remove warning
		
		
	}

}
