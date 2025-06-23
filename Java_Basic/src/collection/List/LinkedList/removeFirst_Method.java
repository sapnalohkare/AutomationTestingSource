package collection.List.LinkedList;

import java.util.LinkedList;

public class removeFirst_Method {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    cars.removeFirst();//remove first element
	    
	    System.out.println(cars);


	}

}
