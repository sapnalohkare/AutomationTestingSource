package collection.iterate_ways;

import java.util.ArrayList;


public class For_Loop {

	public static void main(String[] args) 
	{
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Luxury Range Rover");
		cars.add("Luxury Jeep Wrangler");
		
		 System.out.println("Traversing list through for loop:");  
		 
		for (int i = 0; i < cars.size(); i++) 
		{
			System.out.println(i+" : "+cars.get(i));
		}
	}

}
