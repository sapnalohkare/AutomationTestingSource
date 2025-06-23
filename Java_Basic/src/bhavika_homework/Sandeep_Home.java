package bhavika_homework;

public class Sandeep_Home {
	/*
	 * Nested loop - loop inside loop if we want the values in matrix format, we use
	 * nested loop - outer loop is used for row condition/value - inner loop is used
	 * for column condition/value
	 * 
	 * we can print different patterns by nested loop
	 * 
	 */
	public static void main(String[] args) {
		/*
		 * print the matrix of 3*3 - 11 12 13 21 22 23 31 32 33
		 */
		System.out.println("3*3 matrix of numbers");
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				System.out.print(a + "" + b + " "); // here we use print statement not println
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		/*
		 * print the matrix of 4*5 - * * * * * * * * * * * * * * * * *
		 */ System.out.println("4*5 matrix of * ");
		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				System.out.print(" * "); // here we use print statement not println
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");

		/*
		 * print half pyramid 4*4 - * * * * * * *
		 */ System.out.println("4*4 Half pyramid matrix of  * ");
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		/*
		 * print half pyramid with numbers 4*4 - 1 1 2 1 2 3 1 2 3 4
		 * 
		 */ System.out.println("4*4 Half pyramid matrix with numbers ");
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		/*
		 * print inverted half pyramid 4*4 - * * * * * * *
		 * 
		 * 
		 */ System.out.println("4*4 inverted Half pyramid matrix of  * ");
		for (int x = 4; x >= 1; x--) { // decrement in outer loop only
			for (int y = 1; y <= x; y++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("4*4 inverted Half pyramid matrix of  numbers ");
		for (int x = 4; x >= 1; x--) { // decrement in outer loop only
			for (int y = 1; y <= x; y++) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		/*
		 * print inverted half pyramid 4*5 - * * * * * * * * * * *
		 * 
		 * 
		 */ System.out.println("Hollow rectangle of size 4*5 ");
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 5; y++) {
				if (x == 1 || x == 4 || y == 1 || y == 5) { // important
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		/*
		 * print inverted half pyramid rotate by 180 - * * * * * * *
		 */ System.out.println("Inverted half pyramid rotate by 180 ");
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4 - x; y++) {
				System.out.print("  ");
			}
			for (int z = 1; z <= x; z++) {
				System.out.print("* ");
			}
			System.out.println();

		}
		System.out.println("-----------------------------------");
		/*
		 * print 0-1 triangle - 1 0 1 1 0 1 0 1 0 1 1 0 1 0 1
		 * 
		 */ System.out.println("0-1 triangle of 5*5 matrix ");
		for (int s = 1; s <= 5; s++) {
			for (int p = 1; p <= s; p++) {
				if ((s + p) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();

		}
		System.out.println("-----------------------------------");
		/*
		 * print floyd's triangle - 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 * 
		 */ System.out.println("Floyd's triangle of 5*5 matrix ");

		int g = 1;

		for (int p = 1; p <= 5; p++) {
			for (int q = 1; q <= p; q++) {

				System.out.print(g + " ");
				g++;
			}
			System.out.println();
		}

	}
}
