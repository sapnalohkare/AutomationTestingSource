package Operators;

public class Arithmatic_Operators {

	public static void main(String[] args) {
		

		/*
		 * byte, short, int, long, float, double, char, boolean, String, Array
		 * & __*
		 * 
		 */

		int x=10;    
		System.out.println(x++);   //10 (11)    
		System.out.println(++x);   //12
		
		// *****************Arithmetic operators*********************//
		// addition
		byte a = 4;
		short b = 5;
		int c = a + b;
		System.out.println("Addition is--> " + c);

		// Subtraction
		short d = 10;
		int e = 20;
		long f = d - e;
		System.out.println("substraction is--> " + f);

		// multiplication
		long g = 30;
		float h = 3.3f;
		double i = g * h;
		System.out.println("multplication is--> " + i);

		// division
		short j = 40;
		long k = 10;
		double l = j / k;
		System.out.println("division is--> " + l);

		// modulus
		byte m = 51;
		short n = 5;
		int o = m % n;
		System.out.println("modulus is--> " + o);

		// increment
		float p = 1.2f;
		System.out.println("increment is --> " + (++p));

		// decrement
		double q = 3.4d;
		System.out.println("decrement is --> " + (--q));

		// ***************assignment operators:***************//

		// =
		String fname = "Shahmeer";
		System.out.println("name asign to fname is --> " + fname);

		// +=
		int r = 50;
		r += 50;
		System.out.println("+= result --> " + r);

		// -=
		int s = 50;
		s -= 5;
		System.out.println("-= result --> " + s);

		// *=
		int t = 30;
		t *= 3;
		System.out.println("*= result --> " + t);

		// /=
		int u = 30;
		u /= 3;
		System.out.println("/= result --> " + u);

		// %=
		float v = 5f;
		v %= 3;
		System.out.println("%= result --> " + v);

		
	}

}
	