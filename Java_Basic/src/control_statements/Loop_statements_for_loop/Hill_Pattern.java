package control_statements.Loop_statements_for_loop;

public class Hill_Pattern {

public static void main(String[] args) 
 {
				     /* *           
			        * * * *         
			      * * * * * *       
			    * * * * * * * *     
			  * * * * * * * * * */  
	
	for (int i = 1; i <=5 ; i++) 
	{
		for (int j = i; j <=5; j++) 
		{
			System.out.print("  ");
		}
		
		for (int j = 1; j <=i; j++)
		{
			System.out.print("* ");
		}
		
		
		for (int k = 1; k <=i; k++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}

			
		

	}

}
