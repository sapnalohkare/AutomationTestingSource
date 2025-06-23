package collection.HashSet;

import java.util.HashSet;

public class For_Each_Loop {

	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Sapna");
		set.add("Evanshi");
		set.add("Shahmeer");
		set.add("Sapna");
		
		for (String name : set)
		{
			System.out.println(name);
		}


	}

}
