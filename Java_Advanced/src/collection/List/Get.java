package collection.List;

import java.util.ArrayList;
import java.util.List;

//get  method return elements at present at that particular index 

public class Get {

	public static void main(String[] args) {
		
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		String Challen = TvChallens.get(2);
		
		System.out.println("Challen : "+Challen);

	}

}
