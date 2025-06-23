package collection.List.ArrayList;

import java.util.ArrayList;

public class Remove_Element {

	public static void main(String[] args)
	{
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    //To remove an element, use the remove() method and refer to the index number:
		    cars.remove(2);//Ford
		    
		    System.out.println(cars);


	}

}
