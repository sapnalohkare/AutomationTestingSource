package control_statements.Loop_statements_for_loop;

public class Nested_For_Loop {

	public static void main(String[] args) {
		// Outer loop
		for (int i = 1; i <= 3; i++) {
		  
		  // Inner loop
		  for (int j = 1; j <= 3; j++) 
		  {
		  System.out.println(i+" "+j);
		  }
		}

	}

}
