package collection.iterate_ways;

import java.util.ArrayList;
import java.util.List;

public class ForEach_method {

	public static void main(String[] args) 
	{
		List<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Luxury Range Rover");
		cars.add("Luxury Jeep Wrangler");
		
		System.out.println("Traversing list through forEach() method:");  
		
		cars.forEach(n->{System.out.println(n);});
		

	}

}
