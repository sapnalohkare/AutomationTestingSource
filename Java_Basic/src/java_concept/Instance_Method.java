package java_concept;
public class Instance_Method {
	static char s = 'k';
	
	public static  void First_Method() {
		// trying with the different different data types.

	
		int n = 29;
		int m = 34;
		boolean t = (n > m);

		System.out.println(n);
		System.out.println(s);
		System.out.println(t);
	}

	public static void main(String[] args) {

		
		s= 'r';
		// Creating object to access the static method.
		//
		
		First_Method();

	

	}

}


//Static Method:-

