package collection.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList_ {

	public static void main(String[] args) 
	{
		 // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    
	    
	    for (Iterator<String> iterator = cars.iterator(); iterator.hasNext();) 
	    { 
			System.out.println(iterator.next());
		}
	    

	}

}
