package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_sort_Numerically {

	public static void main(String[] args) 
	{
/*----------------------Numerically----------------*/
		
		ArrayList<Integer> hotels =new ArrayList<Integer>();
		hotels.add(7);
		hotels.add(3);
		hotels.add(2);
		
		Collections.sort(hotels);
		System.out.println(hotels);

	}

}
