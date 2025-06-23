package java_concept;

public class Array 
{
	
	int p = 90;
	public static void main(String[] args)
	{
		Array val = new Array();
		
		val.p= 80;
		System.out.println(val.p);
		
		String[] myChildrenName = {"Anvi","Evanshi","Runavi","Shahmeer"};
		int[] myNumArray = {10,20,30,40};
		
		//changing array content
		myChildrenName [0]="badimommy";
		
		
		
		//fetching or iterating string array*************1***********
//		for(int i =0 ; i < myChildrenName.length; i++)
//		{
//			System.out.println(myChildrenName[i]);
		
//		}
//		
//		//fetching or itrating int array**********1******************
//		for(int j=0 ;j<myNumArray.length;j++ )
//		{
		
//			System.out.println(myNumArray[j]);
//		}
		
		
		//fetching or itrating int array**********1******************
		for (String i : myChildrenName) 
		{
			  System.out.println(i);
		}
		for (int j : myNumArray) 
		{
			  System.out.println(j);
		}
		


		
		
		
	}

}
