package array.multidimentional;

public class For_Each_Loop {

	public static void main(String[] args) 
	{
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		for (int[] row : myNumbers) 
		{
			
		 for (int i : row)
		  {
			 
			 System.out.print(i +" ");
		    
		  }
			System.out.println();
		
			
		}


	}
}


