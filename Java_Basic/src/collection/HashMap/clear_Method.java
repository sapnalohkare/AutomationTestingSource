package collection.HashMap;

import java.util.HashMap;

public class clear_Method {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(202, "sapna");
		map.put(505, "shahmeer");
		map.put(404, "Evanshi");
		map.clear();
		System.out.println(map);// remove all elements
		}

}
