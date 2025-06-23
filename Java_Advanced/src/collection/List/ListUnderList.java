package collection.List;

import java.util.Arrays;
import java.util.List;

public class ListUnderList {

	public static void main(String[] args) {
		 List<List<String>> listOfLists = Arrays.asList(
		            Arrays.asList("Reflection", "Collection", "Stream"),
		            Arrays.asList("Structure", "State", "Flow"),
		            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));
		 
		 System.out.println(listOfLists);

	}

}
