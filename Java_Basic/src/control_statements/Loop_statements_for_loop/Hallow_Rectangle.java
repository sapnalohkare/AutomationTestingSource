package control_statements.Loop_statements_for_loop;

public class Hallow_Rectangle 
{

	/********************
	 *                  *
	 *                  *
	 *                  *
	 ********************/

	public static void main(String[] args) 
	{
		
	
		print_Hallow_Rectangle(5,20);
	 
	 
	}
	 private static void print_Hallow_Rectangle(int rows, int coloumn)
	 {
		 
		 for (int i = 1; i <= rows; i++) 
		   {
			   for (int j = 1; j <=coloumn; j++) 
			   {
				if(i==1 || i == rows || j==1 || j == coloumn )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			   }
			System.out.println();
		   }
	  
	 }
	   

}
