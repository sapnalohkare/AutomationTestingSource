package collection.List;

import java.util.ArrayList;
import java.util.List;

// for traversing elements 
public class ForEach {

	public static void main(String[] args) 
	{
		List<Integer> hotels =new ArrayList<Integer>();
		hotels.add(7);
		hotels.add(3);
		hotels.add(2);
		
		hotels.forEach((n)-> { System.out.println(n); } );

	}

}
