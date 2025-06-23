package array;

public class Anonymous_Array 
{

	public static void main(String[] args) 
	{
		printArray(new int[] {34,65,99,88,109});
	}

	private static void printArray(int[] arr) 
	{
       System.out.println("Printing Anonymous_Array......");
       
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}
}
