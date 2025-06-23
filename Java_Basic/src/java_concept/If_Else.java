package java_concept;

import java.util.Scanner;

public class If_Else 
{
		
	
		public static void main(String[] args)
		{
			Scanner scannerObject = new Scanner(System.in);
			System.out.println("Enter your marks : -");
			int  marks = scannerObject.nextInt();
			try {
				if (marks <= 10 )
				{
					System.out.println("Marks is less than 10 or equals to 10");
				}
				else if (marks <= 50)
				{
					System.out.println("Marks is less than 10 or equals to 10");
					
				}
				else
				{
					System.out.println("You are not allowed");
				}
			
			} catch (Exception StringInput)
			{
				// TODO: handle exception
				System.out.println("it an exception");
			}
			scannerObject.close();
		}
}
