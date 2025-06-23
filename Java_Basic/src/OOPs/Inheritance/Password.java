package OOPs.Inheritance;



public class Password extends Username
{

	public void display()
	{
		System.out.println(this.name + ":-> is a training institute");
		
		
	}
	
	public static void main(String[] args)
	{
		//Inheritance of parent class only
		Username Usename_Object = new Password();
		Usename_Object.name();
		/*Usename_Object.display();------Not Allowed--------*/
		
		
	}

}
