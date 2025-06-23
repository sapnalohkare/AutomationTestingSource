package collection.List.LinkedList_;

import java.util.LinkedList;

public class RemoveLast {

	public static void main(String[] args)
	{
		LinkedList<String> cars = new LinkedList<String>();
		
		cars.add("Baleno");
		cars.add("TATA");
		cars.add("Nano");
		cars.add("Farari");
		cars.add("Nano");
		cars.add("Audi");
		cars.add("Nano");

		cars.removeLast();

		System.out.println(cars);
	}



}
