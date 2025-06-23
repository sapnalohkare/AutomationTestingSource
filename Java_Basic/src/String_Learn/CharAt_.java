package String_Learn;

public class CharAt_ {

	public static void main(String[] args) 
	{
		String s = "Automation";
		
		System.out.println("------------Forward----------");
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.println(s.charAt(i));
		}
		
		System.out.println("------------Reverse----------");
		
		for (int i = s.length()-1; i >=0; i--) 
		{
			System.out.println(s.charAt(i));
		}

	}

}
