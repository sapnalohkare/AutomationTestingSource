package control_statements.jump_statement_break;

public class Do_While_Continue {

	public static void main(String[] args)
	{
		
		int a = 10;
		do {
			a--;
			if (a == 7) {
				continue;
			}
			System.out.print(a+" ");
		} while (a >= 5);
      
		
		
		System.out.println("\n");
		
		
		
		int b = 11;
		do {
			b--;
			if (b == 5) {
				continue;
			}
			System.out.print(b+" ");
		} while (b >= 1);

	}

}
