package collection.List.LinkedList;

import java.util.LinkedList;

public class addLast_Method {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.addLast("Altroz");//add element to last
	    
	    System.out.println(cars);

	}

}
