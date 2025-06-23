package collection.List;

import java.util.ArrayList;
import java.util.List;

//add one collection to other collection : here: (cars <-----luxury_Cars)
public class AddAll_Collection {

	public static void main(String[] args) 
	{
		List<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		
		List<String> luxury_Cars = new ArrayList<String>();
		luxury_Cars.add("Farari");
		luxury_Cars.add("BMW");
		luxury_Cars.add("Audi");
		
		cars.addAll(luxury_Cars);
		
		System.out.println(cars);
		
		

	}

}
