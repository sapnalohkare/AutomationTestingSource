package collection.HashMap;

import java.util.HashMap;

public class get_Method {

	public static void main(String[] args) {
		HashMap<Integer,  String> map = new HashMap<Integer,  String>();
		map.put(202, "sapna");
		map.put(505, "shahmeer");
		map.put(404, "Evanshi");
		
		System.out.println(map.get(505));//get particular object associated with that key
	}

}
