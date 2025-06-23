package java_String;

//Thread safe in nature


/*StringBuffer is a peer class of String, it is mutable in nature and it is thread safe class , 
we can use it when we have multi threaded environment and shared object of string buffer
i.e, used by multiple thread. As it is thread safe so there is extra overhead, 
so it is mainly used for multi-threaded program.*/

public class StringBuffer_ {

	public static void main(String[] args) 
	{
		
		StringBuffer name = new StringBuffer("Automation");
		
		System.out.println(name.append(" Testing"));
		
		System.out.println("---------Mutable : thread safe String : Used for multi threading programe-------");
		
		System.out.println(name);

	}

}
