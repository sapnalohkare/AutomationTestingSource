package control_statements.Loop_statements_for_loop;

public class For_Loop_Homework {

	public static void main(String[] args) {
	

		int table_Num = 10;
		System.out.println("***********Print Any Mathmatical Table **********");
		for (int n = 1; n <= 10; n++) {
		 System.out.println(table_Num+"*"+n+" = "+(table_Num*n));
		}

		System.out.println("\n"+"**********Alternate odd even till 25  **********");
		
		for (int p = 1; p <= 25; p++) {
			if (p % 2 == 0) {
				 System.out.println(p + " is even");
				
			} else {
				System.out.println(p + " is odd");
			}
		}
		

		System.out.println("\n"+"*******************Increment *******************");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("\n"+"*******************Decrement*********************");
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}

		System.out.println("\n"+"*******************Even Number*********************");
		for (int k = 1; k <= 20; k++) {
			if (k % 2 == 0) {
				System.out.println(k);

			}
		}

		System.out.println("\n"+"******************Odd Number*********************");
		for (int m = 0; m <= 10; m++) {
			if (m % 2 != 0) {
				System.out.println(m);

			}
		}

		

	}

}
