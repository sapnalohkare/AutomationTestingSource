package collection.List;

import java.util.ArrayList;
import java.util.Arrays;

	/*The toArray(IntFunction<T[]> generator) method, available for collections 
	and streams in Java, converts the elements into an array of a specified type. 
	It accepts an IntFunction that generates a new array of the desired type and size. 
	The function receives the size of the collection or stream as input and returns a new array instance. 
	This method is particularly useful when you need to ensure the resulting array is of a specific type, 
	especially when working with streams or when the collection might contain null values.*/

public class toArray_03_List_To_Array_with_TypeSafety {

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(6);
		numbers.add(1);
		
		Integer[] intArray = numbers.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));
	}

}
