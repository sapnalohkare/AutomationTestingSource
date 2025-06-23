package collection.List;

import java.util.ArrayList;
import java.util.List;

//check particular element/object/value is available in collection in the form of true and false

public class Contain {

	public static void main(String[] args) 
	{
		List<String> defecnces = new ArrayList<String>();
		defecnces.add("Army");
		defecnces.add("AirForce");
		defecnces.add("Navy");
		
		boolean result_01 = defecnces.contains("Ninja");
		boolean result_02 = defecnces.contains("AirForce");
		
		System.out.println("Condition one : "+result_01+" | Condition two : "+result_02);
	}

}
