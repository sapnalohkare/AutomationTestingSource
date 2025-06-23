package array;

public class Feeling_OneArrayToOther {

	
	public static void main(String[] args)
	{
		//Feeling_OneArrayToOther dg = new Feeling_OneArrayToOther();
              
		String name[] = {"Divakar","Sapna","Evanshi","Shahmeer"};
		
		int size = name.length;

		String[] strArray1 = new String[size]; 
		
		
		for (int i = 0; i < name.length; i++) 
		{
			strArray1[i] = name[i];
		}
		
		for (int i = 0; i < strArray1.length; i++) 
		{
			System.out.println(strArray1[i]);
		}

	}

}
