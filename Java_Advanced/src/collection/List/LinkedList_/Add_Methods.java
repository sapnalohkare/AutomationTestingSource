package collection.List.LinkedList_;

import java.util.LinkedList;

public class Add_Methods {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		// 1)
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		
		

		LinkedList<String> luxury_Cars = new LinkedList<String>();
		luxury_Cars.add("Farari");
		luxury_Cars.add("BMW");
		luxury_Cars.add("Audi");
		
		// 2)
		 cars.add(2, "TATA");
				
        
		// 3)
		cars.addAll(luxury_Cars);
         
		// addLast
		cars.addLast("Audi 7");
				
		// addFirst
		cars.addFirst("Farari");
		
		
		System.out.println(cars);

	}

}
