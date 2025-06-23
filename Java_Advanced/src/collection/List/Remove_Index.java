package collection.List;

import java.util.ArrayList;
import java.util.List;
//remove element of particular index

public class Remove_Index {

	public static void main(String[] args)
	{
		
		List<String> types =new ArrayList<String>();
		types.add("functional testing");
		types.add("unit testing");
		types.add("integration testing");
		types.add("performance testing");
		types.add("regression testing");
		
		//index : 3 : Performance testing : removed
		String removed = types.remove(3);
		System.out.println("Removed : "+removed);
		System.out.println(types);
		

	}

}
