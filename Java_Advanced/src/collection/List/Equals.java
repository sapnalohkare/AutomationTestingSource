package collection.List;

import java.util.ArrayList;
import java.util.List;

public class Equals {

	public static void main(String[] args) 
	{
		
		List<String> beautyProducts = new ArrayList<String>();
		
		beautyProducts.add("Primer");
		beautyProducts.add("Foundation");
		
		
		List<String> makeUp = new ArrayList<String>();
		makeUp.add("HD Makeup");
		makeUp.add("AirBrush Makeup");
		
		List<String> HudaProducts = new ArrayList<String>();
		HudaProducts.add("Primer");
		HudaProducts.add("Foundation");
		
		System.out.println(beautyProducts.equals(HudaProducts));
		System.out.println(HudaProducts.equals(makeUp));
		System.out.println(beautyProducts.equals(beautyProducts));
	}

}
