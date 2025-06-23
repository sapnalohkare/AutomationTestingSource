package this_;

public class Six_Return_Object 
{
	//6) this Keyword Can Be Used To Return the Current Class Instance
	
	String name;
	int age;
	
	Six_Return_Object()
	{
		this.age= 32;
		this.name= "Shubham Lohkare";
	}
	
	
	public Six_Return_Object get_Six_Return_Object()
	{
		return this;
		
	}
	public static void main(String[] args) 
	{
		
		Six_Return_Object object = new Six_Return_Object().get_Six_Return_Object();
		System.out.println(object.age+" "+object.name);
	}

}
