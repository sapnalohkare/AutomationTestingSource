package collection.set.HashSet;
import java.util.HashSet;

public class Remove_Methods {
	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add("Altroz");
		
		HashSet<String> luxury_Cars = new HashSet<String>();
		luxury_Cars.add("Farari");
		luxury_Cars.add("BMW");
		luxury_Cars.add("Audi");
		cars.addAll(luxury_Cars);
		
		//1)
		cars.remove("Suzuki");
		
		 //2): not available
		//cars.remove(0);
		
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
