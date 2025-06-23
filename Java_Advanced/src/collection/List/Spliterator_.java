package collection.List;

import java.util.ArrayList;
import java.util.List;
/*The Spliterator is considerably different from an ordinary iterator. The purpose of a spliterator is to 
 * separate a collection into smaller pieces so that each piece can be processed by a separate thread. 
 * The Spliterator interface has two important methods*/
import java.util.Spliterator;

/*methods : trySplit(),tryAdvance(Consumer action)*/
// splits the List into small small parts

public class Spliterator_ {

	public static void main(String[] args) 
	{
		
		List<String> TvChallens =new ArrayList<String>();
		TvChallens.add("Star Uttsav");
		TvChallens.add("Star Sports");
		TvChallens.add("Star Bharat");
		TvChallens.add("Star Marathi");
		
		Spliterator<String> itr_01 = TvChallens.spliterator();
		Spliterator<String> itr_02 = itr_01.trySplit();
		
		Spliterator<String> itr_03 = itr_02.trySplit();
		
		 // Loop through the first spliterator
	    System.out.println("--------First spliterator------------");
	    while (itr_01.tryAdvance((n)-> {System.out.println(n);}));
	    
	    System.out.println("--------Second spliterator------------");
	    while (itr_02.tryAdvance((n)-> {System.out.println(n);}));
	
	    System.out.println("--------Third spliterator------------");
	    while (itr_03.tryAdvance((n)-> {System.out.println(n);}));
		}
		
		
	}


