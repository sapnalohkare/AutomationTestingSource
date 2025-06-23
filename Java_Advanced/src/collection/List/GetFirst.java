package collection.List;

import java.util.ArrayList;
import java.util.List;

//getFirst return first element of collection
public class GetFirst {

	public static void main(String[] args) 
	{
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		String firstElement = TvChallens.getFirst();
		System.out.println("First Element : "+firstElement);
	}

}
