package collection.HashMap;

import java.util.HashMap;

public class values_Method {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(202, "sapna");
		map.put(505, "shahmeer");
		map.put(404, "Evanshi");
		
		for (String value : map.values())
		{
			System.out.println(value);
		}

	}

}
