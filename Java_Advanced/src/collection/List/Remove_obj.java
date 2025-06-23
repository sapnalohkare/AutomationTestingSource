package collection.List;

import java.util.ArrayList;
import java.util.List;

public class Remove_obj {

	public static void main(String[] args)
	{
		
		List<String> types =new ArrayList<String>();
		types.add("functional testing");
		types.add("unit testing");
		types.add("integration testing");
		types.add("performance testing");
		types.add("regression testing");
		types.add("unit testing");
		
		boolean unitRemove =types.remove("unit testing");
		
		System.out.println("Removed Unit Testing : first index :1 "+unitRemove);
		System.out.println(types);
		System.out.println("Remained unit testing index : "+types.indexOf("unit testing"));
		
	}

}

