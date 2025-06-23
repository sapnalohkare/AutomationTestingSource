package collection.HashSet;

import java.util.HashSet;

public class remove_Method {

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Sapna");
		set.add("Evanshi");
		set.add("Shahmeer");
		set.add("Sapna");
		
		set.remove("Sapna");
		
		System.out.println(set);
		


	}

}
