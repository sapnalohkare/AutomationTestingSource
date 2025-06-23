package collection.set.HashSet;

import java.util.HashSet;
import java.util.Iterator;


public class Declairation {

	public static void main(String[] args) {
		
		HashSet<String> company = new HashSet<String>();
		company.add("Oracle");
		company.add("Microsoft");
		company.add("Fujitsu");
		company.add("Genpact");
		company.add("Infosys");
		company.add("Genpact");
		company.add(null);
		
		
		Iterator<String> itr = company.iterator();
		while (itr.hasNext()) {
			
			String string = (String) itr.next();
			System.out.println(string);
			
		}


	}

}
