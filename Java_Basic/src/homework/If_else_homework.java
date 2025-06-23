package homework;

public class If_else_homework {

	public static void main(String[] args) {

		int int_A = 580;
		int int_B = 60;
		int int_C = 10;

		int age_A = 30;
		int age_B = 10;
		int age_C = 500;

		int a = 108;

		// find even and odd number
		if (a % 2 == 0) {
			System.out.println("Given number is even.");

		} else {
			System.out.println("Given number is odd.");

		}

		// Smallest number from 2 numbers
		if (int_A < int_B) {
			System.out.println("Value of A is Smaller..!");

		} else {
			System.out.println("Value of B is Smaller..!");

		}

		// largest number from 2 numbers
		if (int_A > int_B) {
			System.out.println("Value of A is Greater..");

		} else {
			System.out.println("Value of B is Greater..");

		}

		// Smallest number from 3 number
		if (int_A < int_B && int_A < int_C) {
			System.out.println("Value of A is Smaller..*");
		} else if (int_B < int_A && int_B < int_C) {
			System.out.println("Value of B is Smaller..*");

		} else {
			System.out.println("Value of C is Smaller..*");
		}

		// Calculate Person age greater amongst 3 persons age
		if (age_A > age_B && age_A > age_C) {
			System.out.println("Age of person A is greater..");
		} else if (age_B > age_A && age_B > age_C) {
			System.out.println("Age of person B is greater..");

		} else {
			System.out.println("Age of person C is greater..");
		}

		// Use different operators,data types and conditions in if_else_if statements
		String password = "User@123";
		String name = "WiproEmployee";
		int age = 35;
		long salary = 19000;
		
		boolean log_In = true;
		

		if ( (log_In == true ) && (age >= 30 && age <= 40) && (salary <= 20000)) {
			name= name + "HR";
			password = password +"H";
			
			System.out.println("You are selected for HR round.. " + "\n" + "Your Username is ->" + name  + "\n"
					+ "Your Password is ->" + password );

		} else if (log_In == true && age > 40 && salary > 20000) {
			
			name= name + "One";
			password = password +"O";
			
			System.out.println("You are selected for second round. " + "\n" + "Your Username is ->" + name 
					+ "\n" + "Your Password is ->" + password );
		} else {
			System.out.println("You are not selected.." + "\n" + "Try your luck next time");
		}
		
		
		//Use different operators,data types and conditions in if_else
		if (name.contains("HR")||password.contains("H"))
		{
			System.out.println("your HR interview is sceduled...");
		} 
		else 
		{ 
			if ((name.contains("One")||password.contains("O")))
			{
				System.out.println("your second round interview is sceduled...");
		    }

		}
		
		

	}
	
	

}
