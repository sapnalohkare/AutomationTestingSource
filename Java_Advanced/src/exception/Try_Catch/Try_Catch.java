package exception.Try_Catch;

public class Try_Catch {

	public static void main(String[] args)
	{

   
    try
    {
    	    int a = 10;
    	    int b = 0;
    	    int c = a/b;
    	  
    	    
    	
    }catch(ArithmeticException e)
    {
		
    	  System.out.println("Oop! cant devide by zero.. :");
		
		
	}

    System.out.println("normal flow");
}
}