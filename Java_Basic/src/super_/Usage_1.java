package super_;

// 1) to class parent class constructor..
public class Usage_1 extends  employee {

	
	public Usage_1()
	{
		super();
		System.out.println("child class constructor...");
	}
	
	public static void main(String[] args) 
	{
		Usage_1 usage_Object = new Usage_1();
		System.out.println(usage_Object);
	}

}


class employee
{
	
	public employee()
	{
		System.out.println("Parent class constructor...");
		
		
	}


}