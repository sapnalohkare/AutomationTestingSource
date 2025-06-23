package constructor;

public class User_Defined {

	/* 1)User defined /no-arg constructor constructor is created by programmer 
	   2)If user defined constructor is available then it will call by default by jvm
	*/
	
	User_Defined()
	{
		System.out.println("User Defined Constructor..");
	}
	
	
	public static void main(String[] args) 
	{
		User_Defined object = new User_Defined();
		System.out.println(object);//just to remove warning

	}

}
