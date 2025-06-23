package java_concept;
import java.util.Scanner;

public class multiple_variable
{
	 public static void main(String[] args)
	 {
		Scanner myObj = new Scanner(System.in);
		
		
//		System.out.println("Enter username");
//		String userName = myObj.nextLine();
//		System.out.println("Username is: " + userName);
		
		System.out.println("Enter your Age");
		int age  = myObj.nextInt();
				if (age <= 30 )
				{
					System.out.println("welome to recruitment drive");
					
				} 
				else 
				{
		             System.out.println("You are not allowed");
				}
				
				myObj.close();
				
//		int x = 20 ,   y = 30, z = 50 ;
//		System.out.println();
	 }

}
