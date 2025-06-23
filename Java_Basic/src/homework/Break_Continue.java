package homework;

public class Break_Continue {

	public static void main(String[] args) {

		// Continue- skip the condition

		// Break - break the current condition

		break_In_While_condition();
		System.out.println();

		break_In_do_While_condition();
		System.out.println();

		break_In_For_Condition();
		System.out.println();

		continue_In_While_condition();
		System.out.println();

		continue_In_do_While_condition();
		System.out.println();

		continue_In_For_Condition();

	}

	private static void continue_In_do_While_condition() {

		System.out.println("---------Continue In Do  While condition----------");

		int a = 10;
		do {
			a--;

			if (a == 8) {
				continue;
			}
			System.out.print(a + " ");

		} while (a >= 5);

	}

	private static void continue_In_While_condition() {
		System.out.println("---------Continue In While condition----------");

		int a = 1;

		while (10 > a) {
			a++;

			if (a == 5) {
				continue;
			}
			System.out.print(a + " ");

		}

	}

	private static void continue_In_For_Condition() {
		System.out.println("---------Continue In For condition----------");

		for (int i = 10; i >= 1; i--) {

			if (i == 8) {
				continue;
			}

			System.out.print(i + " ");

		}
	}

	private static void break_In_For_Condition() {
		System.out.println("---------Break In For condition----------");

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");

			if (i == 8) {
				break;
			}

		}

	}

	private static void break_In_do_While_condition() {

		System.out.println("---------Break In Do While condition----------");

		int a = 1;

		do {
			System.out.print(a + " ");

			if (a == 5) {
				break;
			}
			a++;

		} while (a <= 10);

	}

	private static void break_In_While_condition() {
		System.out.println("---------Break In  While condition----------");

		int a = 1;
		while (10 >= a) {

			System.out.print(a + " ");

			if (a == 7) {
				break;

			}
			a++;

		}

	}

}
