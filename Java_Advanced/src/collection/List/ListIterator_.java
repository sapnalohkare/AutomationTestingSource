package collection.List;

import java.util.ArrayList;
import java.util.ListIterator;

//list iterator has : both hasNext(), next() and hasPrevious , previous methods
//with list iterator we can traverse in both the direction
public class ListIterator_ {

	public static void main(String[] args)
	{
		ArrayList<Integer> hotels =new ArrayList<Integer>();
		hotels.add(7);
		hotels.add(3);
		hotels.add(2);
		
		ListIterator<Integer> itr = hotels.listIterator();
		
		System.out.println("------forward--------");
		while (itr.hasNext()) 
		{
			Integer integer = (Integer) itr.next();
			
			System.out.println("Hotels : "+integer);
			
		}
		
		System.out.println("------backward--------");
		
		while (itr.hasPrevious()) {
			Integer integer = (Integer) itr.previous();
			System.out.println("Hotels : "+integer);
			
		}
		 
		

	}

}
