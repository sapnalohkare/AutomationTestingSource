package control_statements.Loop_statements_do_while_loop;

public class While_Do_While_HW {

	public static void main(String[] args) {

		/********** While ***********/

		while_Increment();
		while_Decrement();
		while_Table_Calculation();
		while_Even_Number_01();
		while_Even_Number_02();
		while_Odd_Number_01();
		while_Odd_Number_02();
		while_Print_Automation_Multiple_times();

		/********** Do While ***********/

		do_While_Increment();
		do_While_Decrement();
		do_While_Table_Calculation();
		do_While_Even_Number_01();
		do_While_Even_Number_02();
		do_While_Odd_Number_01();
		do_While_Odd_Number_02();
		do_While_print_Manual_Multiple_times();

		/***************** for *****************/
		for_Increment();
		for_Decrement();
		for_Table_Calculation();
		for_Even_Number_01();
		for_Even_Number_02();
		for_Odd_Number_01();
		for_Odd_Number_02();
		for_Print_Testing_Multiple_times();

	}

	private static void do_While_Odd_Number_02() {

		System.out.println("Odd number way 2 using do while....");

		int i = 0;

		do {
			System.out.println((i * 2) + 1);
			i++;

		} while (i <= 5);
	}

	private static void do_While_Odd_Number_01() {

		System.out.println("Odd number way 1 using do while....");

		int i = 1;

		do {

			if (i % 2 != 0) {
				System.out.println(i);
			}

			i++;
		} while (i <= 10);

	}

	private static void do_While_Even_Number_02() {

		System.out.println("Even number way 2 using do while....");

		int i = 1;

		do {
			System.out.println(i * 2);
			i++;

		} while (i <= 5);

	}

	private static void do_While_Even_Number_01() {

		System.out.println("Even number way 1 using do while....");

		int i = 1;

		do {

			if (i % 2 == 0) {
				System.out.println(i);
			}

			i++;
		} while (i <= 10);

	}

	private static void do_While_Table_Calculation() {
		System.out.println("Mathmatical table using Do While...");

		int num = 9;

		int i = 1;
		do {
			System.out.println(num + "*" + i + " = " + num * i);
			i++;
		} while (i <= 10);

	}

	private static void do_While_Decrement() {
		System.out.println("do while decrement...");

		int a = 5;
		do {
			System.out.println(a);
			a--;

		} while (a >= 1);

	}

	private static void do_While_Increment() {

		System.out.println("do while Increment...");

		int a = 1;
		do {
			System.out.println(a);
			a++;

		} while (a <= 5);

	}

	private static void do_While_print_Manual_Multiple_times() {
		System.out.println("Print Manual 5 times using do while...");
		int a = 1;
		do {
			System.out.println(a + "--> Manual");
			a++;
		} while (a <= 5);
	}

	private static void while_Print_Automation_Multiple_times() {
		System.out.println("Print Automation 5 times using while....");
		int i = 1;
		while (i <= 5) {
			System.out.println(i + "--> Automation");
			i++;

		}

	}

	private static void while_Odd_Number_02() {
		System.out.println("Odd number way 2....");

		int i = 0;
		while (i < 5) {
			System.out.println((i * 2) + 1);
			i++;

		}

	}

	private static void while_Odd_Number_01() {

		System.out.println("Odd number way 1....");

		int i = 1;
		while (i <= 10) {
			if (i % 2 != 0) {
				System.out.println(i);

			}
			i++;

		}

	}

	private static void while_Even_Number_02() {
		System.out.println("Even number way 2 using while....");

		int i = 0;
		while (i <= 5) {
			System.out.println(i * 2);
			i++;

		}

	}

	private static void while_Even_Number_01() {
		System.out.println("Even number way 1 using while....");

		int i = 1;
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.println(i);

			}
			i++;

		}

	}

	private static void while_Table_Calculation() {

		System.out.println("Mathmatical table using while...");

		int table_num = 4;
		int i = 1;
		while (i <= 10) {
			System.out.println(table_num + "*" + i + " = " + (table_num * i));
			i++;
		}

	}

	private static void while_Decrement() {
		System.out.println("while Decrement...");

		int a = 5;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}

	}

	private static void while_Increment() {
		System.out.println("while Increment...");

		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}

	}

	private static void for_Odd_Number_02() {

		System.out.println("odd no way 2 using for....");

		for (int i = 1; i <= 5; i++) {

			System.out.println((i * 2) + 1);
		}

	}

	private static void for_Print_Testing_Multiple_times() {
		System.out.println("Print Testing 5 times using while....");

		for (int j = 1; j <= 5; j++) {
			System.out.println(j + "--> Testing..");
		}

	}

	private static void for_Odd_Number_01() {
		System.out.println("odd no way 1 using for....");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	private static void for_Even_Number_02() {
		System.out.println("even no way 2 using for....");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i * 2);
		}

	}

	private static void for_Even_Number_01() {
		System.out.println("even no way 1 using for....");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

	private static void for_Table_Calculation() {

		System.out.println("Mathmatical table using for....");
		int num = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + " = " + (num * i));
		}

	}

	private static void for_Decrement() {
		System.out.println("decrement using for....");

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

	}

	private static void for_Increment() {
		System.out.println("increment using for....");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
