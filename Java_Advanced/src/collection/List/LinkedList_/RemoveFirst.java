package collection.List.LinkedList_;

import java.util.LinkedList;

public class RemoveFirst {

	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		// 1)
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Nano");
		cars.add("Farari");
		cars.add("Nano");
		cars.add("Audi");
		
		cars.removeFirst();
		
		System.out.println(cars);
	}
	

}
