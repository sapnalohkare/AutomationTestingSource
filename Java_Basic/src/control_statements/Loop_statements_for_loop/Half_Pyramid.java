package control_statements.Loop_statements_for_loop;

public class Half_Pyramid {

	public static void main(String[] args) 
	{
	   /* 
		* * 
		* * * 
		* * * * 
		* * * * */
		//5 row and 5 column
		
		
		//outer loop for row
		for (int i = 1; i <=5 ; i++)
		{
			//inner loop for column
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	
		}

}
