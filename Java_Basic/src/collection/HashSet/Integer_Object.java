package collection.HashSet;

import java.util.HashSet;

public class Integer_Object {

	public static void main(String[] args) {

		HashSet<Integer> num_Set = new HashSet<Integer>();

		num_Set.add(3);
		num_Set.add(10);
		num_Set.add(6);

		for (int i = 0; i <= 10; i++) {
			if (num_Set.contains(i)) {
				System.out.println(i + " is in set");
			} else {
				System.out.println(i + " is not in set");
			}
		}

	}

}
