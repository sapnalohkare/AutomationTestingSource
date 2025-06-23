package collection.List;

import java.util.ArrayList;
import java.util.List;

//isEmpty : return true or false for collection filled or not

public class IsEmpty {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<String>();
		items.add("TV");
		items.add("Fridge");
		
		List<Integer> hotels =new ArrayList<Integer>();
		
		boolean items_empty = items.isEmpty();
		boolean hotels_empty = hotels.isEmpty();
		
		System.out.println("Items Empty ? : "+items_empty);
		
		System.out.println("Hotels Empty ? : "+hotels_empty);
		

	}

}
