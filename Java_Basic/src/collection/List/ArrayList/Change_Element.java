package collection.List.ArrayList;

import java.util.ArrayList;

public class Change_Element {

	public static void main(String[] args)
	{

		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    //To modify an element, use the set() method and refer to the index number:
		    cars.set(0, "Nexon");
		    System.out.println(cars);

	}

}
