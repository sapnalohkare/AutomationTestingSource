package collection.HashSet;

import java.util.HashSet;

public class clear_Method {

	public static void main(String[] args)
	{

		HashSet<String> set = new HashSet<String>();
		set.add("Sapna");
		set.add("Evanshi");
		set.add("Shahmeer");
		set.add("Sapna");
		
		set.clear();
		System.out.println(set);
	}

}
