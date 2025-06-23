package collection.List.ArrayList;

import java.util.ArrayList;

public class For_Each_ArrayList {

	public static void main(String[] args) 
	{
		 ArrayList<String> cars = new ArrayList<String>();
		 cars.add("Baleno");
		 cars.add("BMW");
		 cars.add("Nexon");
		 cars.add("Altroz");
		 
		 for (String name : cars) 
		 {
			System.out.println(name);
		}


	}

}
