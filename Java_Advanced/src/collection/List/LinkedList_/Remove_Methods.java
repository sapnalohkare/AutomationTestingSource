package collection.List.LinkedList_;

import java.util.LinkedList;

public class Remove_Methods {

	public static void main(String[] args) 
	{
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add("Anuj");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Virat");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Amit");  
         
         //1)
         ll.remove("Vijay");
         
         //2)
         ll.remove(0);  
         
         LinkedList<String> ll2=new LinkedList<String>();  
         ll2.add("Ravi");  
         ll2.add("Hanumat");  
         ll.addAll(ll2); 
         
         //3)
         ll.removeAll(ll2);
         
         //4)
         ll.removeFirst();  
         
         //5)
         ll.removeLast();  
         
         //6)
         ll.removeFirstOccurrence("Gaurav");  
         
         //7)
         ll.removeLastOccurrence("Harsh");  
         
         System.out.println(ll);
         
         //8)
         ll.clear();  
         
         System.out.println(ll);
         
         
	}

}
