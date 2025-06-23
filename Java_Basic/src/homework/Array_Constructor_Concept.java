package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Constructor_Concept
{
	int year;
	String modelName;
	static Scanner sc = new Scanner(System.in);

	
	public Array_Constructor_Concept()
	{
		System.out.println("<----calling user defined constructor------->");
		year = 2024;
		modelName = "Altroz";
		
	}
	public Array_Constructor_Concept(int year, String modelName)
	{
		System.out.println("<----calling Parameterized constructor------->");
		this.year= year;
		this.modelName =modelName; 
		
		
	}
	public static void main(String[] args) 
	{
		System.out.println("<-------Constructor concept-------->");
		
		System.out.println("1)Default Constructor"+"\n"+"2)User Defined constructor"+"\n"+"3)Parameterized Constructor");
		
		//calling user defined constructor 
		Array_Constructor_Concept User_Object = new Array_Constructor_Concept();
		System.out.println(User_Object.year+" "+User_Object.modelName);
		
		//-calling Parameterized constructor
		Array_Constructor_Concept para_Object = new Array_Constructor_Concept(2099, "BMW");
		System.out.println(para_Object.year+" "+para_Object.modelName);
		
		
		User_Input_Array_Creation();
		Reversal_Of_An_Array();
		duplicate_Values_From_An_Array();
		
		

	}

	

	private static void duplicate_Values_From_An_Array()
	{
		System.out.println("\n"+"<------Duplicate Values Array concept------->");
		int arr[]= {70,500,79,500,56,500,45,500,70,56,56};
		System.out.println(Arrays.toString(arr));
		
		int dup_Num= 500;
		int count=0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==dup_Num)
			{
				count++;
			}
		}
		
		 System.out.println(dup_Num+" Repeted--> "+count+" times..");
		
	}

	private static void Reversal_Of_An_Array() 
	{
      int arr[] = {23,56,16,78,100,67};
      
      System.out.println("<---Array Before Reversal-->"+"\n"+Arrays.toString(arr));
   
      System.out.println("<---Array After Reversal--->");
      	
      for (int i = (arr.length-1); i >= 0; i--)
      {
		System.out.print(arr[i]+" ");
	  }
		
	}

	private static void User_Input_Array_Creation() {

		int[] arr = new int[4];

		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter Number at postion--> " + i);

			int a = sc.nextInt();
			arr[i] = a;

		}
		
		
		System.out.println("<----User Enetered Array is--> "+Arrays.toString(arr));
	}

}
