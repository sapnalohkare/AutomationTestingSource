package collection.List.LinkedList_;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {

	public static void main(String[] args) {
		
		 LinkedList<String> trees =new LinkedList<String>();  
		 trees.add("mango");  
		 trees.add("chikoo");  
		 trees.add("Papaya");  

		 
		 Iterator< String> itr = trees.descendingIterator();
		 
		 while(itr.hasNext())  
         {  
             System.out.println(itr.next());  
         }  
	}

}
