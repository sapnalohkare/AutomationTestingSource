package control_statements.Loop_statements_for_loop;

public class Floyds_Triangle {

	public static void main(String[] args) 
	{

		/*
		 * 1 
		 * 2  3 
		 * 4  5  6 
		 * 7  8  9  10 
		 * 11 12 13 14 15
		 */

		  int num = 1;

		// outer loop for row
		for (int i = 1; i <= 5; i++)
		{
			
			// inner loop for column
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println();
		}

	}

}
