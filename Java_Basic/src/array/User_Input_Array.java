package array;

import java.util.Arrays;
import java.util.Scanner;

public class User_Input_Array {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        
        for (int i = 0; i < arr.length; i++) 
        {
        	System.out.println("Enter Number..."+i);
        	
        	int a= sc.nextInt();
			arr[i]=a;
		}
        
        System.out.println(Arrays.toString(arr));
   
        sc.close();
   

	}

}
