package bhavika_homework;


public class Arguments {

	// creating instance variables to pass the arguments in method.
	int a;
	int b;
	float w;
	long q;
	boolean c = (a <= b); // taking boolean data type to declare the conditions.

	// static variable to pass the arguments in methods.
	static int t;
	static int h;
	static float o;

	// boolean c = (a <= b); // taking boolean data type to declare the conditions.

	public void instance_M(int e, int f, float p) {

	// assign arguments to the variables.

		a = e;
		b = f;
		w = p;

		System.out.println("The value of condition a<=b is:" + c);
		System.out.println("The value of argument e is:" + a);
		System.out.println("The value of argument f is:" + b);
		System.out.println("The value of argument w is:" + w);
	}

	public static void Static_M(int j, int k, float m) {
		// creating object to access the non static variables.

		//Arguments r = new Arguments();
		t = j;
		h = k;
		o = m;
		boolean l = (t >= h);
		// System.out.println("The value of condition a<=b is:"+c);
		System.out.println("The value of argument j is:" + t);
		System.out.println("The value of argument k is:" + h);
		System.out.println("The value of condition t>=h:" + l);
		System.out.println("The value of argument m is:" + o);
	}

	public static void main(String[] args) {

		// creating objects for instance method to access the instance variables.
		Arguments r = new Arguments();
		r.instance_M(11, 23, 34.5f); // passing arguments of int data byte using boolean data types output will be in
		// true/false.
		Static_M(22, 33, 33.4f); // passing arguments of int data byte using boolean data types output will be in
		// true/false.
	}

}

