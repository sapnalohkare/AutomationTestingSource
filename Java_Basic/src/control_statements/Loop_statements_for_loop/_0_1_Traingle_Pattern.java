package control_statements.Loop_statements_for_loop;

public class _0_1_Traingle_Pattern {

	public static void main(String[] args)
	{
		  /*1 
			0 1 
			1 0 1 
			0 1 0 1 
			1 0 1 0 1 */
			
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j<=i; j++) 
			{
				int sum = i+j;
				
				if (sum%2==0) 
				{
					System.out.print(1 +" ");
					
				} else 
				{
					System.out.print(0 + " " );
				}
			
			}
			System.out.println();
		}
		

	}

}
