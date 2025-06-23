package exception.Try_Catch;

public class Try_Catch_Finally {

	public static void main(String[] args) 
	{
		
		
		try {
			
			int[] arr = {3,4,6,8,9};
			System.out.println(arr[10]);
			
		} catch (Exception e) 
		{
		
			System.out.println("oops its an error ...");
		}finally 
		{
			System.out.println("runs no matter what : uses for clean the resources");
		}

	}

}
