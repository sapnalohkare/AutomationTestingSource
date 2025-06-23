package array;

import java.util.Arrays;

public class toString_Method {

	public static void main(String[] args) {

		int a[] = { 40, 69, 2, 1 };

		Arrays.sort(a);
		/*for (int i : a) {
			System.out.println(i);
		}*/
		System.out.println(Arrays.toString(a));
	}

}
