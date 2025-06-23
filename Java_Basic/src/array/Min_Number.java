package array;

public class Min_Number {

	public static void main(String[] args) 
	{
		int number[] = {55,11,99,66,77};
		
		 int min_Num =  min(number); 
		 
		 System.out.println("Lowest number from the given Array is--> "+min_Num);


	}

	private static int min(int[] number)  
	{
		int min_Num = number[0];
		
		for (int i = 1; i < number.length; i++)
		{
			if (min_Num>number[i]) 
			{
				min_Num = number[i];
			}
			
		}


		return min_Num;
	}

}
