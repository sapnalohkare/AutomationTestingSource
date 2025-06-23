package collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class hasNext_Method {

	public static void main(String[] args) 
	{
		 ArrayList<String> college = new ArrayList<String>();
	     
	     college.add("Buniyadi");
	     college.add("Kesrimal");
	     college.add("Prerna");
	     college.add("JD College");
	     
	     Iterator<String> it = college.iterator();//Initializing iterator
	     
	     //loop through ArrayList
	     while (it.hasNext()) 
	     {
			System.out.println(it.next());
			
		 }

	}

}
