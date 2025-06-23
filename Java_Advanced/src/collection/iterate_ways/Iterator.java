package collection.iterate_ways;

import java.util.ArrayList;

import java.util.List;

public class Iterator {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Luxury Range Rover");
		cars.add("Luxury Jeep Wrangler");
		
		java.util.Iterator<String>itr = cars.iterator();
		
		
		while (itr.hasNext()) 
		{
			String string = (String) itr.next();
			System.out.println(string);
		}

	}

}
