package collection.List;

import java.util.ArrayList;
import java.util.List;
//removes last element of the collection
public class RemoveLast {

	public static void main(String[] args) {
		List<String> types =new ArrayList<String>();
		types.add("functional testing");
		types.add("unit testing");
		types.add("integration testing");
		types.add("performance testing");
		types.add("regression testing");
		
		String removed = types.removeLast();
		System.out.println(removed);
		System.out.println(types);


	}

}
