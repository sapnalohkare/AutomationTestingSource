package collection.List;

import java.util.ArrayList;
import java.util.List;

//addLast : adds element to last index : 7
public class AddLast {

	public static void main(String[] args) 
	{
		
		List<String> talukas = new ArrayList<String>() ;
		talukas.add("Arvi");
		talukas.add("Ashti");
		talukas.add("Deoli");
		talukas.add("Hinganghat");
		talukas.add("Karanja");
		talukas.add("Samudrapur");
		talukas.add("Seloo");
		
		//add at last index : 7
		talukas.addLast("Wardha");
		
		System.out.println(talukas);
		
		
		
		
		

	}

}
