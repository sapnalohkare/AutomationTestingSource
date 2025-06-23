package collection.List;

import java.util.ArrayList;
import java.util.List;

//indexOf : return index of particular element
public class IndexOf {

	public static void main(String[] args) 
	{
		List<String> hotels =new ArrayList<String>();
		hotels.add("7 stars");
		hotels.add("3 stars");
		hotels.add("2 stars");
		
		int index = hotels.indexOf("2 stars");
		System.out.println("2 star hotel index : "+index);

	}

}
