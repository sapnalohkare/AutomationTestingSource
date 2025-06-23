package control_statements.Loop_statements_for_loop;

public class Left_Half_Pyramid_180 
{

	public static void main(String[] args)
	{
			       /* 
			      * * 
			    * * * 
			  * * * * 
			* * * * */
		
		//outer loop
		for (int i = 1; i <=5; i++) 
		{
            //loop for space  
			for (int k = 1; k <=5-i; k++)
			{
				System.out.print("  ");
			}
			//loop for star
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			
			}
			System.out.println();
		}

		
		
		
			
	}
}

