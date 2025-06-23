package array;

import java.util.Arrays;

public class Fill_Method {

	public static void main(String[] args) 
	{
		String[] fruits = {"Banana", "Orange", "Apple", "Mango"};
		Arrays.fill(fruits, "Kiwi");
		
		System.out.println("......Kiwi will be added to every index.......");
		
		for (String name : fruits) 
		{
			System.out.println(name);
			
		}


	}

}
