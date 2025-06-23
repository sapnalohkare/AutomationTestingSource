package String_Learn;

public class String_Creation {

	public static void main(String[] args) 
	{
		//4 ways
		
		String s = "STP"; //By string literal
		String name = new String("Infotech");//By new keyword
		StringBuffer s_buffer = new StringBuffer("Arvi Naka");//thread safe
		StringBuilder s_builder = new StringBuilder("Wardha");//Not thread safe
		
		
		System.out.println("String is --> "+s);
		System.out.println("String as object --> "+name);
		System.out.println("String Buffer is --> "+s_buffer);
		System.out.println("String Builder is --> "+s_builder);

	}

}
