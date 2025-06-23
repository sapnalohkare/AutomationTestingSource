package collection.iterate_ways;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	//traverse in both forward and backward
	
	public static void main(String[] args)
	{
		List<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Luxury Range Rover");
		cars.add("Luxury Jeep Wrangler");
		
		 System.out.println("Traversing list through List Iterator:");  
		 
		java.util.ListIterator<String> listItr = cars.listIterator();
		
		System.out.println("-----------Forward-------------");
		
		while (listItr.hasNext()) 
		{
			String  name = listItr.next();
			System.out.println(name);
			
		}
		
		System.out.println("-----------Backward-------------");
		while (listItr.hasPrevious()) 
		{
			String  name = listItr.previous();
			System.out.println(name);
			
		}

	}

}
