package control_statements.Loop_statements_do_while_loop;

public class do_While {

	public static void main(String[] args) {
		
		int i =0;
		do {
			System.out.println("Value of i is.."+i);
			i++;
			
		} while (i<5);
      
		
		/********do while *********/
		
		int countdown = 3;
		
		do {
			System.out.println(countdown);
			countdown--;
			
		} while (countdown>0);
		System.out.println("HAPPY NEW YEAR.....");
		
	}

}
