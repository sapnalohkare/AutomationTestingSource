package collection.List;

import java.util.ArrayList;
import java.util.List;

//Reverse the defined list
public class Reversed {

	public static void main(String[] args)
	{
		List<String> types =new ArrayList<String>();
		types.add("functional testing");
		types.add("unit testing");
		types.add("integration testing");
		types.add("performance testing");
		types.add("regression testing");
		
		//reverse the list
		types.reversed();
		
		System.out.println(types);

	}

}
