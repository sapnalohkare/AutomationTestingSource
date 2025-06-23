package array.multidimentional;

public class Declairing_Multidimensional_Array {

	public static void main(String[] args)
	{   
		//Declaration of an array
		int[][] arr1 = {{2,3,5},{6,9,0},{6,8,9}};
		
		int[] arr2[] =  {{2,3,5},{6,9,0},{6,8,9}};
		
		int arr3 [][] =  {{2,3,5},{6,9,0},{6,8,9}};
		
		int [][]arr4 =  {{2,3},{6,9},{6,8}};//rows 0 to 2, column  = 0 to 1
		
		/********************understand this**************************/
		for (int i = 0; i <= 2; i++) 
		{
			for (int j = 0; j <=1; j++) 
			{
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		//int [][]arr =  {{4,10,20},{33,56,66}}; similar to
		
		int[][] arr = new int[2][3];
		//rows 0 to 1
		//column 0 to 2
		arr[0][0] = 4;
		arr[0][1] = 10;
		arr[0][2] = 20;
		arr[1][0] = 33;
		arr[1][1] = 56;
		arr[1][2] = 66;
		
	/*	for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}*/
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		System.out.println(arr.length);//3
		System.out.println(arr1.length);//3
		System.out.println(arr2.length);//3
		System.out.println(arr3.length);//3
		System.out.println(arr4.length);//3

	}

}
