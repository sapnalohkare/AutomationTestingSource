package modifier.Variable;

/*At the time of serialization, if we don’t want to save value of a particular variable in a file,
 * then we use transient keyword. When JVM comes across transient keyword, 
 * it ignores original value of the variable and save default value of that variable data type..*/


public class Transient 
{

  
 // Transient variables
    transient int k = 30;
	 
	
	public static void main(String[] args)throws Exception 
	{
		
		System.out.println("Jvm will store default value of int K : 0");
	}

}
