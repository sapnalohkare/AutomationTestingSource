package collection.set.LinkedHashSet;

import java.util.LinkedHashSet;

public class Declairation {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> empIDs = new LinkedHashSet<Integer>();
		
		
		for (int i = 1; i <= 100; i++) 
		{
			empIDs.add(i);
		}
		

		System.out.println(empIDs);
	}

}
