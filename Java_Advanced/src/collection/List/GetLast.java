package collection.List;

import java.util.ArrayList;
import java.util.List;

//getLast return last element of collection

public class GetLast {

	public static void main(String[] args) {
		
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		String lastElement = TvChallens.getLast();
		
		System.out.println("Last Element : "+lastElement);

	}

}
