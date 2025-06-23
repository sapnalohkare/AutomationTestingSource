package collection.List;

import java.util.ArrayList;
import java.util.List;
//subList : Return list as per specified index
public class SubList {

	public static void main(String[] args) {
		
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		List<String> sublist = TvChallens.subList(1, 3);
		
		System.out.println(sublist);

	}

}
