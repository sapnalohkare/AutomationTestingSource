package collection.List;

import java.util.ArrayList;
import java.util.List;

//sort in order : ascending , alphabetically,condition
public class Sort {

	public static void main(String[] args) {
		
		//--------------------- sort alphabetically-------------------
		List<String> AutomationTypes = new ArrayList<String>();
		AutomationTypes.add("Functional");
		AutomationTypes.add("Unit");
		AutomationTypes.add("Integration");
		AutomationTypes.add("Non-functional");
		AutomationTypes.add("Performance");
		AutomationTypes.add("Regression");
		AutomationTypes.add("Keyword-driven");

		// sort alphabetically
		AutomationTypes.sort(null);

		System.out.println(AutomationTypes);

		//--------------------- sort ascending-------------------
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(6);
		numbers.add(1);
		
		//sort ascending
		numbers.sort(null);
		
		System.out.println(numbers);
		
		//--------------------- sort on String length-------------------
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		//condition
		TvChallens.sort((a,b)-> {return -1 * a.compareTo(b);});
		System.out.println(TvChallens);
		
		
		
		
		

	}

}
