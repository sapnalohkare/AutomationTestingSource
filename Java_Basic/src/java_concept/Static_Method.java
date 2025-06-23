package java_concept;
public class Static_Method {
	
	
	public static int mymethod() 
	{
		return 0;
	
	};

	public static void Second_Method() {

		// trying with the different different data types.
		int a = 23;
		int b = 45;
		char j = 'h';
		boolean f = (a > b);
		byte g = 23;
		float f1 = 34.56f;
		System.out.println(a);
		System.out.println(j);
		System.out.println(f);
		System.out.println(g);
		System.out.println(f1);

	}

	public static void main(String[] args) {

		// for static method no need to create objects with the help of reference
		// variable, we can access the static method directly using Method_name.
		// first method of declaring object.
		Second_Method();

		// second method of declaring object.
		Static_Method.Second_Method();
	}


}