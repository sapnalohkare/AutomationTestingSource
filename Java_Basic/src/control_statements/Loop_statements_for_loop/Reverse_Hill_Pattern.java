package control_statements.Loop_statements_for_loop;

public class Reverse_Hill_Pattern {

	public static void main(String[] args)
	{
			 /* * * * * * * * * *   
			    * * * * * * * *     
			      * * * * * *       
			        * * * *         
			          * */

		for (int i = 1; i <=5 ; i++) 
		{
			for (int j = 1; j <=i ; j++)
			{
				System.out.print("  ");
				
			}
			
			for (int j = i; j <=5; j++)
			{
				System.out.print("* ");
			}
			for (int k = i; k <=5; k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}

}
