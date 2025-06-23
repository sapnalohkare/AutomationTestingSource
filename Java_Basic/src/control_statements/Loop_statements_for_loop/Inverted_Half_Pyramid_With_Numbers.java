package control_statements.Loop_statements_for_loop;

public class Inverted_Half_Pyramid_With_Numbers {

	public static void main(String[] args)
	{
		/* 1  2  3  4  5
		 * 1  2  3  4
		 * 1  2  3  
		 * 1  2
		 * 1  
		 */
		
		//outer for rows
		for (int i = 5; i >=1 ; i--)
		{
			//inner for column
			for (int j = 1; i>= j; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
