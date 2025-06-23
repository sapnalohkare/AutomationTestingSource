package bhavika_homework;

public class Return_Types
{

	// creating instance variables.
		int a = 23;
		int b = 11;

		boolean c = a >= b;

		// creating instance method.
		// type_01:- without using parameters and with no return statements.
		public void Return_Type01() {

			System.out.println("The value of a is:" + a);
			System.out.println("The value of b is:" + b);
			System.out.println("The value of c is:" + c);

		}

	// creating static method for first return type.
		public static void Return_Types_S01() {
			Return_Types r = new Return_Types();
			System.out.println("The value of c is:"+r.c);
		}

		// Type_02:--without return statement with parameters.
		public void Return_Types02(int f, float g) {
			System.out.println("The value of F is:"+f);
			System.out.println("The value of g if:"+g);
		}

		public static void Return_Types_S02(int f, float g) {
			// Return_Types r= new Return_Types();
			System.out.println("The value of f is :"+f);
			System.out.println("The value of g is :"+g);

		}

		//Type_03:-- with return statement and parameters.
		public void Return_Types03(int h, long i) {
			System.out.println("The value of h & i is:"+h + i);
			return;
		}

		public static void Return_Types_S03(int h, long i) {
			System.out.println(h);
			System.out.println(i);
			return;
		}

		//Type_04:-- with return type & having parameters.
		public float Return_Types04(float k, long l) {
			return k + l;
		}

		public static boolean Return_Types_S04(float k, long l) {
			return k <= l;
		}

		public static void main(String[] args)
		{
			Return_Types r = new Return_Types();
			r.Return_Type01();
			r.Return_Types02(34, 22.34f);
			r.Return_Types03(24, 20);
			System.out.println(r.Return_Types04(35.89f, 89));
			Return_Types_S01();
			Return_Types_S02(23, 89.4f);
			Return_Types_S03(12, 32);
			System.out.println(Return_Types_S04(23.3f, 34));
		}

	}


