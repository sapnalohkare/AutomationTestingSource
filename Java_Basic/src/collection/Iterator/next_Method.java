package collection.Iterator;

import java.util.ArrayList;
import java.util.Iterator;


public class next_Method {

	public static void main(String[] args)
	{
     ArrayList<String> college = new ArrayList<String>();
     
     college.add("Buniyadi");
     college.add("Kesrimal");
     college.add("Prerna");
     college.add("JD College");
     
    

   Iterator<String> name = college.iterator();
   
   System.out.println(name.next());

	}

}
