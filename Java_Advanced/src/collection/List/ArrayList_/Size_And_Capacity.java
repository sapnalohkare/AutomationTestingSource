package collection.List.ArrayList_;

import java.util.ArrayList;

public class Size_And_Capacity {

	public static void main(String[] args) 
	{
		// Create an ArrayList of Integer type
		ArrayList<Integer> al = new ArrayList<Integer>();
		// Print the size of the ArrayList using the size() method
		System.out.println("The size of the array is: " + al.size());//The size of the array is: 0

		/*------------------------Capacity-------------*/
		
		
		// Create an ArrayList of Integer type with an initial capacity of 10  
        ArrayList<Integer> all = new ArrayList<Integer>(10);         
        // Print the size of the ArrayList using the size() method  
        System.out.println("The size of the array is: " + all.size());    //The size of the array is: 0
	}

}
