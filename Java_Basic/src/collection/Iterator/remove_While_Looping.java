package collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class remove_While_Looping {

	public static void main(String[] args) 
	{
		ArrayList<Integer> college = new ArrayList<Integer>();
	     
	     college.add(82);
	     college.add(8);
	     college.add(70);
	     
	     
	     Iterator<Integer> it = college.iterator();//Initializing iterator
	     
	     while (it.hasNext()) 
	     {
	    	 Integer val  = it.next();
			if (val<10) 
			{
				it.remove();
				
			}
			
		}
	     
	     System.out.println(college);


	}

}
