package array;
public class Creating_An_Array {

	public static void main(String[] args)
	{
		//Declaring an array in 4 ways
		int[] arr = {2,3,4,6};
		int []arr1 = {5,6,7,8};
		int arr3[] = {5,6,7,8};
		int[] arr4 = new int[5];
		int arr5[]  = new int[5];
		
		System.out.println(arr.length +" "+ arr1.length +" "+arr3.length+" "+arr4.length+" "+arr5.length);
		arr4[0] = 10;
		arr4[1] = 20;
		arr4[2] = 30;
		arr4[3] = 40;
		arr4[4] = 60;
		
		
		for (int i = 0; i < arr4.length; i++)
		{
			System.out.println(arr4[i]);
		}
		
		

	}

}
