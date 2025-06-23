package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Method {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		Collections.sort(cars);

		
		System.out.println("After sorting.....");
		for (String name : cars) {
			System.out.println(name);
		}
		
		System.out.println();

		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(33);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(34);
		myNumbers.add(8);
		myNumbers.add(12);
		
	Collections.sort(myNumbers);
	
	System.out.println("After sorting.....");
	
	for (Integer integer : myNumbers) 
	{
		
		System.out.println(integer);
		
	}

	}

}
