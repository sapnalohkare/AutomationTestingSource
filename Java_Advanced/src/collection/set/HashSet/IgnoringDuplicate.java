package collection.set.HashSet;

import java.util.HashSet;

public class IgnoringDuplicate {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		
		name.add("IBM");
		name.add("Delloit");
		name.add("TCS");
		name.add("Delloit");
		name.add("TCS");
		name.add("IBM");
		name.add("IBM");
		
		//ignores duplicates
		System.out.println(name);
		
		
		
	}

}
