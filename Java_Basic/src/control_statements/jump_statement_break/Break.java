package control_statements.jump_statement_break;

public class Break {

	public static void main(String[] args) 
	{
		//used to break current flow of program
       
		for (int i = 1; i <=10; i++) 
		{
			if (i==5) 
			{
				System.out.println("Execution will stop after 5...");
				break;
			}
		}
      

	}

}
