package collection.List;

import java.util.ArrayList;
import java.util.List;
//remove first element of collection
public class RemoveFirst {

	public static void main(String[] args) {
		List<String> types =new ArrayList<String>();
		types.add("functional testing");
		types.add("unit testing");
		types.add("integration testing");
		types.add("performance testing");
		types.add("regression testing");
		
		String removed = types.removeFirst();
		System.out.println(removed);
		System.out.println(types);

	}

}
