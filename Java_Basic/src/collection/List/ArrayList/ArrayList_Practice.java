package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Practice {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{   
		// method 1 
		
		List collection = new ArrayList();//creating old non-generic arraylist
		collection.add(0,"Sapna");
		collection.add(1,"Anvi");
		collection.add(2, "Evanshi");
		System.out.println(collection);
		
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("BMW");
		 list.add("volvo");
		 list.add("TATA");
		 
		 
		 System.out.println(list);
		 
	 }  
		//ArrayList<String> cars = new ArrayList()



	}


