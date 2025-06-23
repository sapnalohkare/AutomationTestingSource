package control_statements.Loop_statements_for_loop;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Rough {

	public static void main(String[] args) 
	{
		 @SuppressWarnings("resource")
		 Scanner input = new Scanner(System.in);
	     
		 boolean continueInput = true;

	    
	    do {
	        try{
	            System.out.print("Enter an integer: ");
	            int number = input.nextInt();

	            System.out.println(
	                    "The number entered is " + number);
	            for (int i = 1; i <=10; i++) 
				{
					System.out.println(number+" * "+i+" = "+(number*i));
				}
				continueInput= false;
	        }
	        catch (InputMismatchException ex) {
	            System.out.println("Try again. (" +
	                    "Incorrect input: an integer is required)");
	            input.nextLine();
	            }
	        }
	        while (continueInput);
	    
	    }   
	
		

}