package array.multidimentional;

public class For_Loop {

	public static void main(String[] args) 
	{
      int arr[][]= {{1,2,3},{2,4,6,8},{2,7}};
      
     for (int i = 0; i < arr.length; i++) 
     {
		
    	 for (int j = 0; j < arr[i].length; j++)
    	 {
			System.out.print(arr[i][j]+" ");
		 }
    	 System.out.println();
     }


	}

}
