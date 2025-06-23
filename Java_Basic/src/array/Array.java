package array;

public class Array {

	public static void main(String[] args) {

		/*
		 * An array is typically a grouping of elements of the same kind that are stored
		 * in a single, contiguous block of memory.
		 */

		/*
		 * There are two types of array. 1)Single Dimensional Array 2)Multidimensional
		 * Array
		 * 
		 * syntax:
		 * 1) dataType[] arr; 
		 * (or) 
		 * 2) dataType []arr; 
		 * (or)
		 * 3) dataType arr[]
		 * 4)int arr[] = new int[5];
		 */

		int arr[] = new int[5];
        
		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 1;
		
		//OR
		
		int int_arr[] = {4,5,6,7,1};
		
		//iteration  by for each and by for loop
	
		
		System.out.println("********** for each ************");
		
		for(int k : arr)
		{
			System.out.println(k);
		}	
		
		
		System.out.println("***********for loop*************");

		for (int i = 0; i < int_arr.length; i++) 
		{
		System.out.println(int_arr[i]);
		}
		
		

	}

}
