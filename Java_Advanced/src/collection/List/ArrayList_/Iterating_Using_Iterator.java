package collection.List.ArrayList_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterating_Using_Iterator {

	public static void main(String[] args) 
	{
		List<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Luxury Range Rover");
		cars.add("Luxury Jeep Wrangler");
		cars.add("Luxury Audi Q5");
		cars.add("Luxury BMW i7");
		cars.add("Luxury Mercedes-Benz C-Class");
		cars.add("Luxury Bentley Continental GT");
		cars.add("Audi"); 
		
		
		List<String> luxury_Cars = new ArrayList<String>();
		
		Iterator<String> itr = cars.iterator();
		
		
		//iterator to add elements to another Collection
		while (itr.hasNext()) 
		{
			String string = (String) itr.next();
			if (string.contains("Luxury")) 
			{
				luxury_Cars.add(string);
			}
			
			
			
		}
		
		Iterator<String> l_itr = luxury_Cars.iterator();
		
		//iterator to fetch collection elements
		while (l_itr.hasNext()) 
		{
			String carName = l_itr.next();
			
			System.out.println(luxury_Cars.indexOf(carName)+" : "+carName);
		}
		
		
		
		

	}

}
