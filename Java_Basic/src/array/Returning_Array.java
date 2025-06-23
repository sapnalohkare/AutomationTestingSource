package array;

import java.util.Arrays;

public class Returning_Array {

	public static void main(String[] args) 
	{

     int arr[]= sortArray(new int[] {4,2,3,5,1});
     
     for (int i : arr) 
     {
		System.out.print(i+" ");
	}
	}

	private static int[] sortArray(int[] arr) 
	{ 
		Arrays.sort(arr);//sorting array in ascending direction
		
		return arr;
	}

}
