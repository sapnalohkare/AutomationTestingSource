package collection.HashSet;

import java.util.HashSet;

public class Syntax {

	public static void main(String[] args) 
	{
		// A HashSet is a collection of items where every item is unique, and it is
		// found in the java.util package

		HashSet<String> set = new HashSet<String>();
		set.add("Sapna");
		set.add("Evanshi");
		set.add("Shahmeer");
		set.add("Sapna");
		
		System.out.println(set);

	}

}
