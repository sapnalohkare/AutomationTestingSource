package collection.List;

import java.util.ArrayList;
import java.util.Arrays;

//toArray : convert ArrayList to Array
public class toArray_01_List_to_Array {

	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(6);
		numbers.add(1);
	
		//Heterogeneous array
		Object[] array  = numbers.toArray();
		
		System.out.println(Arrays.toString(array));
		
		System.out.println("----For Each loop----");
		for(Object item : array) {
		      System.out.println(item);
		    }

	}

}
