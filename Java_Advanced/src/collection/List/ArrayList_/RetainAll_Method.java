package collection.List.ArrayList_;

import java.util.ArrayList;


public class RetainAll_Method {

	public static void main(String[] args)
	{
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Farari");
		cars.add("Baleno");
		cars.add("Audi");
		cars.add("Altroz");
		
		ArrayList<String> luxury_Cars = new ArrayList<String>();
		luxury_Cars.add("Farari");
		luxury_Cars.add("BMW");
		luxury_Cars.add("Audi");
		
		
		boolean common = cars.retainAll(luxury_Cars);
		
		System.out.println(common +" : "+cars);
		
		
		

	}

}
