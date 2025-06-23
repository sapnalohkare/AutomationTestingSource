package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_sort_Alphabetically {

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
		

	}

}
