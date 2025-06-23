package control_statements.Loop_statements_for_loop;

public class Factorial_Of_Number {

	public static void main(String[] args) {
		
		
		// fact = 5 * 4*3*2*1;
		
		int num = 5;
		int fact=1;
		
		for (int i = 1; i<=num ; i++)
		{
			fact = fact*i;
			
		}
      
		System.out.println("Factorial is -->"+fact);
	}

}
