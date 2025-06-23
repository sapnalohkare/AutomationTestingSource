package collection.List;

import java.util.ArrayList;
import java.util.List;

//removeif : predicate : condition : remove based on condition written

public class RemoveIf {

	public static void main(String[] args) 
	{
		
		List<String> types =new ArrayList<String>();
		types.add("functional testing");
		types.add("unit testing");
		types.add("");
		types.add("integration testing");
		types.add("performance testing");
		types.add("regression testing");
		types.add("regression testing testing");
		
		System.out.println(types);
		
		//empty elements removed
		types.removeIf(String::isEmpty);
		System.out.println(types);
		
		//if have unit word remove
		types.removeIf(n -> n.contains("unit"));
		System.out.println(types);
		
		//removes if string length is > 20
		types.removeIf(name -> name.length()>20);
		System.out.println(types);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(6);
	    numbers.add(1);
	    
	    //remove even numbers
	    numbers.removeIf(n-> n%2==0);
	    System.out.println(numbers);
	    
	    numbers.add(4);
	    numbers.add(10);
	    
	    System.out.println(numbers);
	    
	    int a= 7;
	    
	    // removes if number is < 7
	    numbers.removeIf(n-> n<a);
	    System.out.println(numbers);
	    
	}

}
