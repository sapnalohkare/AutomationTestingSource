package collection.List.ArrayList_;

import java.util.ArrayList;


public class Remove_Methods {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Altroz");
		
		ArrayList<String> luxury_Cars = new ArrayList<String>();
		luxury_Cars.add("Farari");
		luxury_Cars.add("BMW");
		luxury_Cars.add("Audi");
		cars.addAll(luxury_Cars);
		
		//1)
		cars.remove("Suzuki");
		
		 //2)
		cars.remove(0);
		
		//3)
		cars.removeAll(luxury_Cars);
		
		//4)
		cars.removeIf(a-> a.contains("Altroz"));
		
		System.out.println(cars);
		
		//5)
		cars.clear();
          
		System.out.println(cars);
	}

}
