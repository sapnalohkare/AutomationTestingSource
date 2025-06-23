package OOPs.Polymorphism;

public class Override  implements Login 
{

	
	
	public static void main(String[] args) 
	{
		Override obj = new Override();
		obj.login();
	}

	@java.lang.Override
	public void login() 
	{
		System.out.println("Login from Override ");
		
	}

}

interface Login
{
	
public void login();

public static void  Logout()
{
	System.out.println("Logout from Login");
}
}