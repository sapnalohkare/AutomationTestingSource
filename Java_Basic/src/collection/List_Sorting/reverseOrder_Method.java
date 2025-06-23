package collection.List_Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class reverseOrder_Method {

	public static void main(String[] args) 
	{
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Collections.sort(cars,Collections.reverseOrder());//sort array in reverse manner
	    
	    for (String name : cars) {
			System.out.println(name);
		}
	    
	    System.out.println("---------------------------------");
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);

	    Collections.sort(myNumbers, Collections.reverseOrder()); // sort array in reverse manner

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }

	}

}
