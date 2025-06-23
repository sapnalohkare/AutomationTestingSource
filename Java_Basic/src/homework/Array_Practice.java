package homework;

public class Array_Practice {

	public static void main(String[] args) {
		/*
		 * An array is typically a grouping of elements of the same kind that are stored
		 * in a single, contiguous block of memory.
		 */

		/*
		 * There are two types of array. 1)Single Dimensional Array 2)Multidimensional
		 * Array
		 * 
		 * syntax: 1) dataType[] arr; 2) dataType []arr; 3) dataType arr[] 4)int arr[] =
		 * new int[5];
		 * 
		 */
		lengthMethod();
		System.out.println();
		
		arrayCreation();
		System.out.println();
		
		loop_Through_An_Array();
		System.out.println();
		
		changeArrayElement();

	}

	private static void arrayCreation() {
		
		
		System.out.println("--------------- Ways of declairing arrray--------------------");

		String[] name = { "Kesrimal", "Prerna", "JD" };

		int[] percentage = { 85, 70, 70, 72 };

		float salary[] = { 23.09f, 55.09f, 64.009f };

		char grade[] = new char[2];

		System.out.println(
				"name array lenght : " + name.length + "\n" + "percentage array lenght : " + percentage.length + "\n"
						+ "salary array lenght : " + salary.length+"\n" + "grade array lenght : " + grade.length + "\n");

	}

	private static void lengthMethod() {

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println("length method output--> " + cars.length);

	}

	private static void loop_Through_An_Array() {
		int arr[] = new int[5];

		arr[0] = 4;
		arr[1] = 5;
		arr[2] = 6;
		arr[3] = 7;
		arr[4] = 1;

		// iteration by for each and by for loop

		System.out.println("-------------for each---------------");

		for (int k : arr) {
			System.out.print(k+" ");
		}

		System.out.println("\n"+"------------for loop----------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void changeArrayElement() {

		String[] family_Member = { "SHANKAR", "SAPNA", "EVANSHI", "SHAHMEER" };

		family_Member[0] = "DIVAKAR";

		System.out.println("\n"+"----------Array after modification--------------"+"\n");

		for (String member : family_Member) {
			System.out.print(member + " ");

		}

	}

}
