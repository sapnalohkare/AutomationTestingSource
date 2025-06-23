package collection.List;

import java.util.ArrayList;


//clone : create exact similar collection clone method is available  for : ArrayList and Linkedlist

public class Clone_ 
{


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		ArrayList<String> originalList = new ArrayList<String>(); 
		
		originalList.add("karnataka");
		originalList.add("Maharashtra");
		originalList.add("Goa");
		
		
		 ArrayList clonedList = (ArrayList) originalList.clone();
		 
		 //added new element to 0th index
		 clonedList.add(0,"Kerala");
				 
		 
		 System.out.println("Original List : "+originalList);
		 
		 System.out.println("Cloned List : "+clonedList);
		
		 
	        
	}

}
