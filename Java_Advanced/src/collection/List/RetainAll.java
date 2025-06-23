package collection.List;

import java.util.ArrayList;
import java.util.List;

// keeps only common values : Update list with common items by comparing two list
public class RetainAll {

	public static void main(String[] args) 
	{
		List<String> beautyProducts = new ArrayList<String>();
		beautyProducts.add("Kajal");
		beautyProducts.add("Huda Primer");	
		beautyProducts.add("Huda Foundation");
		
		List<String> HudaProducts = new ArrayList<String>();
		HudaProducts.add("Huda Primer");
		HudaProducts.add("Huda Foundation");
		
		//return only same elements
		beautyProducts.retainAll(HudaProducts);
		System.out.println(beautyProducts);

	}

}
