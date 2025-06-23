package control_statements.Loop_statements_for_loop;

public class Reverse_Left_Half_Pyramid {

	public static void main(String[] args) {

		 
		//outer for rows 
		for (int i = 5; i>=1; i--) 
		{
			//inner for column
			for (int j = 5; i<=j; j--) 
			{
				System.out.print("");
			}
			
			
			for (int l = 5; i>=l; l--) 
			{
				System.out.print("*");
				
				
			}
			
			System.out.println();
		}
	}

}
