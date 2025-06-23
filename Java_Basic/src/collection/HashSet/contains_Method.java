package collection.HashSet;

import java.util.HashSet;

public class contains_Method {

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Sapna");
		set.add("Evanshi");
		set.add("Shahmeer");
		set.add("Sapna");
		
		System.out.println(set.contains("Evanshi"));
		


	}

}
