package control_statements.Loop_statements_for_loop;

public class Solid_Rectangle {

	public static void main(String[] args) {
		
		//4 rows
		//5 column
		
	   /* * * * * 
		* * * * * 
		* * * * * 
		* * * * */ 

		for (int i = 1; i<= 4; i++) 
		{
			//System.out.println("1");
			for (int j = 1; j <= 5 ; j++) 
			{
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}

	}

}
