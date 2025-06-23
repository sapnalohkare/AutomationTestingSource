package collection.List;

import java.util.ArrayList;
import java.util.List;

//add collection to specific index
public class AddAll_Index_Collection {

	public static void main(String[] args) 
	{
		List<String> program = new ArrayList<String>();
		program.add("Dance India Dance");
		program.add("India's Superstar");
		program.add("Kon Banega Karorpati");
		
		List<String> programNew = new ArrayList<String>();
		programNew.add("Crime Petrol");
		programNew.add("CID");
		programNew.add("BalikaVadhu");
		
		program.addAll(2, programNew);
		
		System.out.println(program);
		

	}

}
