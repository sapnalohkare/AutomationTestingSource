package collection.iterate_ways;

import java.util.ArrayList;

public class ForEachRemaining {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Luxury Range Rover");
		cars.add("Luxury Jeep Wrangler");

		System.out.println("Traversing list through forEachRemaining() method:");

		java.util.Iterator<String> itr = cars.iterator();

		itr.forEachRemaining(a -> {
			System.out.println(a);
		});

	}

}
