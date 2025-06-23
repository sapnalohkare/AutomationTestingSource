package collection.List;

import java.util.ArrayList;
import java.util.List;

//replaceAll : n-> condition : replace all as per current condition
public class ReplaceAll {

	public static void main(String[] args) {
		List<String> beautyProducts = new ArrayList<String>();
		beautyProducts.add("Kajal");
		beautyProducts.add("Primer");	
		beautyProducts.add("Foundation");
		
		System.out.println("Before replace All : "+beautyProducts);
		
		//replace all with Huda + and then previous name 
		beautyProducts.replaceAll(n-> "Huda "+ n );
		System.out.println("After replace All : "+beautyProducts);
		
		/*------------------------Second Example ---------------------------*/
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(6);
		    numbers.add(1);
		    
		    //replace all with one number plus
		    numbers.replaceAll(n-> n+1);
		    System.out.println("After replace All : "+numbers);
		
		

	}

}
