package collection.set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;


public class Convert_AnotherCollection_To_HashSet {

	
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Nano");
		cars.add("Baleno");
		cars.add("Suzuki");
		cars.add(0, "TATA");
		
		LinkedList<String> list=new LinkedList<String>();  
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay"); 
		  
		  HashSet<String> set_Arr=new HashSet(cars);  
		  
		  System.out.println(set_Arr);
		  
		  HashSet<String> set_Linked=new HashSet(list); 
		  
		  System.out.println(set_Linked);
		
	}
	 


}
