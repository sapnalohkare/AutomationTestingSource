package collection.List;

import java.util.ArrayList;
import java.util.List;

//as list accepts duplicates so lastIndexOf : gives last index int value of duplicated element

public class LastIndexof {

	public static void main(String[] args)
	{
		List<String> classList = new ArrayList<String>();
		classList.add("Nursury");
		classList.add("Class 1");
		classList.add("KG 1");
		classList.add("KG 2");
		classList.add("Class 1");
		
		int lastindex = classList.lastIndexOf("Class 1");
		System.out.println("Last index : Class-1 : "+lastindex);
		
	}

}
