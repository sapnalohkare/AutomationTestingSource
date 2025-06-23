package collection.List;

import java.util.ArrayList;
import java.util.List;

//addFirst : adds element to first index : 0
public class AddFirst {

	public static void main(String[] args) 
	{
		List<String> trees = new ArrayList<String>();
		
		trees.add("Apple");
		trees.add("Orange");
		trees.add("Banana");
		
		trees.addFirst("Mango");
		
		System.out.println(trees);
	
		

	}

}
