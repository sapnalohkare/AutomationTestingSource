package array;

public class Loop_Though_An_Array {

	public static void main(String[] args)
	{
     
		String array[]= {"Divakar","Swapna","Evanshi","Shahmeer"};
		
		/******1***********/
		for (int i = 0; i < array.length; i++) 
		{
			if (array[i]== "Swapna")
			{
				array[i]= "Sapna";
			}
			System.out.println(array[i]);
		}
		
		System.out.println("\n");
		/********2***********/
		for(String i : array)
		{
			System.out.println(i);
		}

	}

}
