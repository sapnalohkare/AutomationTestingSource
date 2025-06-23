package collection.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Declairation {

	public static void main(String[] args) {
		
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("India", "Delhi");
		capitalCities.put("Pakisthan", "Lahore");
		capitalCities.put("Bangladesh", "Dhaka");
		capitalCities.put("China", "Beijing");
		capitalCities.put("China", "chin");
		
		System.out.println(capitalCities.clone());
		System.out.println(capitalCities.keySet());
		System.out.println(capitalCities.get("Pakisthan"));
		System.out.println(capitalCities.values());
		System.out.println(capitalCities.containsKey("China"));
		System.out.println(capitalCities.containsValue("Lahore"));
		System.out.println(capitalCities.remove("Pakisthan"));
		System.out.println(capitalCities.remove("Bangladesh","Dhaka"));
		System.out.println(capitalCities.replace("India","Mumbai"));
		System.out.println(capitalCities.replace("China","Beijing","Veitnam"));
	
		
		System.out.println(capitalCities);
		
		
		  Iterator<Entry<String, String>> hmIterator = capitalCities.entrySet().iterator();
		
		while (hmIterator.hasNext()) 
		{
			Map.Entry<String, String> mapElement = (Entry<String, String>) hmIterator.next();
			
			System.out.println(mapElement.getKey()+" : "+mapElement.getValue());
			
		}

	}

}
