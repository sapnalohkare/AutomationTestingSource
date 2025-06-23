package collection.List;

import java.util.ArrayList;
import java.util.List;
//remove one collection from others
public class RemoveAll_Collection {

	public static void main(String[] args) {
		
		List<String> beautyProducts = new ArrayList<String>();
		beautyProducts.add("Kajal");
		beautyProducts.add("Primer");
		beautyProducts.add("Foundation");
		
		
		List<String> HudaProducts = new ArrayList<String>();
		HudaProducts.add("Primer");
		HudaProducts.add("Foundation");
		
		boolean result = beautyProducts.removeAll(HudaProducts);
		System.out.println(result);
		System.out.println(beautyProducts);
		
		/*boolean result_01 = HudaProducts.removeAll(beautyProducts);
		System.out.println(HudaProducts);--ans:--[]--0 element---*/

	}

}
