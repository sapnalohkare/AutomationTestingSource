package collection.HashSet;

import java.util.HashSet;

public class size_Method {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Sapna");
		set.add("Evanshi");
		set.add("Shahmeer");
		set.add("Sapna");
		
		System.out.println(set.size());

	}

}
