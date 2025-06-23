package collection.List.ArrayList;

import java.util.ArrayList;

public class Add_Element_To_Index {

	public static void main(String[] args)
	{

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Thar");
		cars.add("Nexon");
		cars.add("TATA");
		
		
		// add an item at a specified position by referring to the index number:
		cars.add(0, "Baleno");
		
		System.out.println(cars);
		

	}

}
