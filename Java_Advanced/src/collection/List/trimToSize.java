package collection.List;

import java.util.ArrayList;

//Reduce the capacity of a list to exactly the size of the list:

/* Removing items from a list may leave the space for those items reserved. 
When you are not using of the capacity of an ArrayList 
then there is some wasted memory which can accumulate if your program makes
use of many ArrayLists. You can use the trimToSize() method to recover the unused memory.*/
public class trimToSize {

	public static void main(String[] args) {
		
		ArrayList<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		TvChallens.trimToSize();
		
		System.out.println(TvChallens);
	}

}
