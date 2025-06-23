package collection.List.ArrayList_;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {

	public static void main(String[] args) {
		
		/*----------------------Alphabetically----------------*/
		
		ArrayList<String> stateList = new ArrayList<String>();

		stateList.add("karnataka");
		stateList.add("Maharashtra");
		stateList.add("Goa");
		stateList.add("Andra Pradesh");
		stateList.add("Tamilnadu");
		stateList.add("Gujrat");
		stateList.add("Goa");
		
		//sorts alphabetically
		Collections.sort(stateList);
		
		System.out.println(stateList);
		
		/*----------------------Numerically----------------*/
		
		ArrayList<Integer> hotels =new ArrayList<Integer>();
		hotels.add(7);
		hotels.add(3);
		hotels.add(2);
		
		Collections.sort(hotels);
		System.out.println(hotels);
		
		
		

	}

}
