package java_concept;

import java.util.Scanner;

public class boolen_value
{
	int i =7;
	
	
//cnt +shift +F
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		boolen_value obj = new boolen_value();
		System.out.println(obj.i);
	
		System.out.println("Enter your choice");
		 Boolean bValue = sc.nextBoolean();
		 System.out.println(bValue);
	
		  System.out.println("Enter your name"); String name = sc.nextLine();
			  
		  System.out.println("Enter your age"); int age = sc.nextInt();
		  
		  
			  System.out.println("my name and my age is : -"+name+"--------"+age + bValue
			  ); 
			 
		 sc.close();
	}

	
}
