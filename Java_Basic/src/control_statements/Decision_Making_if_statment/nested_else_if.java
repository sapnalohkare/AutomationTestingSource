package control_statements.Decision_Making_if_statment;

public class nested_else_if {

	public static void main(String[] args)
	{
		int time = 22;
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time < 15) {
			System.out.println("Good evening.");
		} else if (time < 18) {
			System.out.println("Good night.");
		} else {
			System.out.println("Good day.");
		}

	}

}
