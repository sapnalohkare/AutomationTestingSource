package control_statements.jump_statement_continue;

public class Continue {

	public static void main(String[] args) 
	{

      for (int i = 1; i <= 10; i++) 
      {
    	  if (i==5) 
    	  {
			System.out.println("skips the current condition with continue..."+i);
			continue;
		 }
		
	  }

	}

}
