package array;

public class Max_Number {

	public static void main(String[] args) 
	{
      int num[]= {77,22,55,88,909};
      int max_Num = max(num);
      System.out.println("Greatest number from the given Array is--> "+max_Num);


	}

	private static int max(int[] num) 
	{
       int max_Num = num[0];
       
       for (int i = 1; i < num.length; i++) 
       {
		if(max_Num<num[i])
		{
			max_Num = num[i];			
		}
       }

		return max_Num;
	}

}
