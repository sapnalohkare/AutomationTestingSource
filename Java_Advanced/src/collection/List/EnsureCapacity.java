package collection.List;

import java.util.ArrayList;

//used for ArrayList : ensure that all till last elements is added to List : specifies size to ensure that all elements get added
//its just ensure capacity : not assign that capacity list :list remain 0 till we add
public class EnsureCapacity {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//only ensures capacity
		list.ensureCapacity(15);
		
		
		
		for (int i = 1; i <= 15 ; i++) 
		{
			list.add(i);
			
		}
		
		list.add(20);
		
		System.out.println(list);
		

	}

}
