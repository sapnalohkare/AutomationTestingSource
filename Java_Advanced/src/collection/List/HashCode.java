package collection.List;

import java.util.ArrayList;
import java.util.List;

//return Hashcode value of specified collection
public class HashCode {

	public static void main(String[] args) 
	{
		List<String> items = new ArrayList<String>();
		items.add("TV");
		items.add("Fridge");
		items.add("Fan");
		
		int hashVal = items.hashCode();
		
		System.out.println("HashCode value : "+hashVal);//1067207631
	}

}
