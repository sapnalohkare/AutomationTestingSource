package homework;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class_HW
{
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		perform_Arithmatic_Operation(sc);
		
		write_Any_Mathmatical_Table(sc);
       
		sc.close();
	}
    
	//method for printing numerical table
	private static void write_Any_Mathmatical_Table(Scanner input ) {
		
		 boolean continueInput = true;
		do {
			
			try {
				System.out.print("Enter an integer to print table.. ");
				int number = input.nextInt();

				for (int i = 1; i <= 10; i++) {
					System.out.println(number + " * " + i + " = " + (number * i));
				}
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println( "Incorrect input: an integer is required");
				input.nextLine();
			}
		} while (continueInput);
		
		
	}

    //method for arithmetic operator
	private static void perform_Arithmatic_Operation(Scanner input) 
	{
		 boolean arth_Op = true;
		 
		do {

			System.out.println("Enter mathamtical Operator (+,-,/,*,=)");

			char char_val = input.next().charAt(0);

			switch (char_val) {

			case '+':
				System.out.println("Addition Operator..!"+"\n");
				arth_Op = false;
				break;

			case '-':
				System.out.println("Substracion Operator..!"+"\n");
				arth_Op = false;
				break;

			case '*':
				System.out.println("Multiplication Operator..!"+"\n");
				arth_Op = false;
				break;
			case '=':
				System.out.println("Equals Operator..!"+"\n");
				arth_Op = false;
				break;
			case '/':
				System.out.println("Division Operator..!"+"\n");
				arth_Op = false;
				break;
				
				
			}

		} while (arth_Op);

		
	}

}
