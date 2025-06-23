package control_statements.Loop_statements_while_loop;

public class While {

	public static void main(String[] args) {
		
	
		int i =0;
		while(i < 3)
		{
			System.out.println("value of i is .." +i);
			i++;
		}
         /********real life example*************/
		int countdown = 3;
		while(countdown>0)
		{
			System.out.println(countdown);
			countdown--;
		}
		
		System.out.println("HAPPY NEW YEAR.....");
	}

}
