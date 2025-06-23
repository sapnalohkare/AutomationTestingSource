package collection.List.ArrayList;

import java.util.ArrayList;

public class ArrayList_Syntax {

	public static void main(String[] args)
	{
		
     ArrayList<String> list_01 = new ArrayList<String>();

     
     //Primitive data type boolean ,char byte int short, long, float, double 
     //use Wrapper Classes..............
     
     ArrayList<Boolean> list_03 = new ArrayList<Boolean>();
     ArrayList<Character> list_04 = new ArrayList<Character>();
     ArrayList<Byte> list_05 = new ArrayList<Byte>();
     ArrayList<Integer> list_06 = new ArrayList<Integer>();
     ArrayList<Short> list_07 = new ArrayList<Short>();
     
     System.out.println(list_01+" "+list_03+" "+list_04+" "+list_05+" "+list_06+" "+list_07);
     
     list_01.add("BMW");// to add elements to the list
     list_01.add(0, "Mazda"); // Insert element at the beginning of the list (0)
     list_01.get(0);//to access element of refereed index number:
     list_01.set(0, "Opel");//set/modify  the element at particular index
     list_01.remove(0);//remove element from particular index
     list_01.clear();//clear all elements
     list_01.size();//check the size of ArrayList
     
     

	
	}

}
