package collection.List;

import java.util.ArrayList;
import java.util.List;

//add element to specific index : it should be in serial manner 3rd index can not access before first else its
//exception : IndexOutOfBoundsException:

public class Add_index {

	public static void main(String[] args) {

		List<Character> grades = new ArrayList<Character>();

		grades.add(0, 'A');
		grades.add(1, 'B');
		grades.add(2, 'C');
		grades.add(3, 'D');

		System.out.println(grades);
	}

}
