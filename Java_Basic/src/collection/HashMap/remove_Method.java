package collection.HashMap;

import java.util.HashMap;

public class remove_Method {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(202, "sapna");
		map.put(505, "shahmeer");
		map.put(404, "Evanshi");
		map.remove(202);
		System.out.println(map);// remove particular object associated with that key
	}
}
