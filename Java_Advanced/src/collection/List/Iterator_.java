package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_ {

	public static void main(String[] args) 
	{
		List<String> company = new ArrayList<String>();
		company.add("Wipro");
		company.add("Apple");
		company.add("Infosys");
		company.add("Capgemini");
		
		Iterator<String> itr = company.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
				
			
		}
		company.remove(0);
		System.out.println(company);
	}

}
