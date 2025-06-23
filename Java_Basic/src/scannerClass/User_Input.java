package scannerClass;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) 
	{

      @SuppressWarnings("resource")
	  Scanner sc_Object = new Scanner(System.in);
      System.out.println("Enter Your Name, age and salary...");
      
      String  name = sc_Object.nextLine();
      String age = sc_Object.nextLine();
     // double salary = sc_Object.nextDouble();
     String con =  name+" ".concat(age);
      System.out.println(con);
     // System.out.println("User name is -->"+name+"Age is -->"+age+"salary is -->"+salary);
      
      

	}

}

