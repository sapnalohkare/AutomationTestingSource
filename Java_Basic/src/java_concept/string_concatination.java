package java_concept;

public class string_concatination 
{
	//byte a;
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g; 
	String name ;//‘\u0000’ (null character)
	Array p[];
	boolean h;
		public static void main(String[] args) 
		{
			string_concatination v = new string_concatination();
			//byte a = 0;
//			//int b= 5; v.
//			System.out.println(v.a);
//			System.out.println(v.b);
//			System.out.println(v.c);
//			System.out.println(v.d);
//			System.out.println(v.f);
			System.out.println(v.p);
			System.out.println(v.name);
			//System.out.println();
			
			String firstName = "sapna ";
			String lastName = "lohkare";
			System.out.println("name of candisate is:- " +firstName +lastName);
			System.out.println(("name of candisate is:-"+" " +firstName.concat(lastName))); //method used
		}
}
