package collection.List_Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_String_ArrayList {

	public static void main(String[] args) 
	{
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		   Collections.sort(cars);//sort cars alphabetically
		    
		    for (String name : cars) 
		    {
				System.out.println(name);
			} 


	}

}
