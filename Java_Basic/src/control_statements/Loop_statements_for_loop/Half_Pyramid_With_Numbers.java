package control_statements.Loop_statements_for_loop;

public class Half_Pyramid_With_Numbers {

	public static void main(String[] args)
	{
	 
		//Half_Pyramid_With_Numbers
			
		  /*1 
			1 2 
			1 2 3 
			1 2 3 4 
			1 2 3 4 5*/ 
        
		//outer of Row  5
		for (int i = 1; i <= 5; i++) 
		{
			//outer of Column  5
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		

	}

}
