package control_statements.Loop_statements_for_loop;

public class Inverted_Half_Pyramid {

	public static void main(String[] args) {
    
		   /* * * * *
            * * * *
            * * *
            * *
            */
		 
		//outer for rows 
		for (int i = 5; i >= 1; i--) 
		{
			//inner for column
			for (int j = 1; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
