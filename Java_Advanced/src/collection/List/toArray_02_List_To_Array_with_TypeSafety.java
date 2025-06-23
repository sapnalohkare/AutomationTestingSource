package collection.List;

import java.util.ArrayList;
import java.util.Arrays;

/*This Java program demonstrates how to convert an ArrayList of integers into 
an array of the integers using the toArray(T[]) method. This method is particularly 
useful when we want to specify the type of the array ensuring the type safety 
and avoiding the need for the type casting.*/
public class toArray_02_List_To_Array_with_TypeSafety {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(6);
		numbers.add(1);
		
		//creating new array
		Integer arr[] = new Integer[numbers.size()];
		
		arr = numbers.toArray(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}

}
