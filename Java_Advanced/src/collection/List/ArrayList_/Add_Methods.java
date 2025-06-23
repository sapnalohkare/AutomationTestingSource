package collection.List.ArrayList_;

import java.util.ArrayList;
import java.util.List;

public class Add_Methods {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add(0, "TATA");
		
		List<String> luxury_Cars = new ArrayList<String>();
		luxury_Cars.add("Farari");
		luxury_Cars.add("BMW");
		luxury_Cars.add("Audi");
		
		cars.addAll(luxury_Cars);
		
		System.out.println(cars);

	}

}
