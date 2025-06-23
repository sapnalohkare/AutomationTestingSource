package collection.List;

import java.util.ArrayList;
import java.util.List;

//check if specific collections elements are present in other collection or not result : either true or false

public class ContainsAll {

	public static void main(String[] args) 
	{
		List<String> beautyProducts = new ArrayList<String>();
		beautyProducts.add("Kajal");
		beautyProducts.add("Primer");
		beautyProducts.add("Foundation");
		
		
		List<String> makeUp = new ArrayList<String>();
		makeUp.add("HD Makeup");
		makeUp.add("AirBrush Makeup");
		
		List<String> HudaProducts = new ArrayList<String>();
		HudaProducts.add("Primer");
		HudaProducts.add("Foundation");
		
		
		boolean result_01 =beautyProducts.containsAll(HudaProducts);//true
		System.out.println("result_01 : "+result_01);
		
		
		boolean result_02 = beautyProducts.containsAll(makeUp);//false
				System.out.println("result_01 : "+result_02);
		
		boolean result_03 =beautyProducts.containsAll(beautyProducts);//true
				System.out.println("result_01 : "+result_03);
		

	}

}
