package collection.List.LinkedList;

import java.util.LinkedList;

public class getLast_Method {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    cars.getLast();//get last element
	    
	    System.out.println(cars.getLast());


	}

}
