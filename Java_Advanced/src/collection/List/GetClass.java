package collection.List;

import java.util.ArrayList;
import java.util.List;

//getClass  method return class name where that particular collections written

public class GetClass {

	public static void main(String[] args)
	{
		
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		
		System.out.println("class name : "+TvChallens.getClass());
	}

}
