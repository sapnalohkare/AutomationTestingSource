package collection.List;

import java.util.ArrayList;
import java.util.List;

//removes all elements from the list and list size = 0

public class Clear {

	public static void main(String[] args)
	{
		List<Integer> percentage = new ArrayList<Integer>();
		percentage.add(null);
		percentage.add(80);
		percentage.add(90);
		System.out.println(percentage);
		
		//removes all elements from the list
		percentage.clear();
		System.out.println(percentage);

	}

}
