package collection.List.ArrayList;

import java.util.ArrayList;

public class Clear_All_Elements {

	public static void main(String[] args) 
	{
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    //To remove all the elements in the ArrayList, use the clear() method:
		    cars.clear();
		    
		    System.out.println(cars);


	}

}
