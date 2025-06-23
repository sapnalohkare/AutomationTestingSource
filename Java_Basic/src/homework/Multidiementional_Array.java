package homework;

import java.util.Arrays;

public class Multidiementional_Array {

	public static void main(String[] args) 
	{

		declairing_Multidimentional_Aarray();
		System.out.println();

		Accessing_2D_Array_By_For_Loop_With_Lenght_Method();
		System.out.println();

		Accessing_2D_Array_By_For_Loop_Without_Length_Method();
		System.out.println();

		Accessing_2D_Array_By_For_Each();
		System.out.println();

		heterogeneous_Object_Creation();
		System.out.println();

		Arrays_Class_Methods();

	}

	private static void Arrays_Class_Methods() 
	{
		System.out.println("------Arrays class Method-----");
		
		toString_Method();
		sort_Method();
		compare_Method();
		equals_Method();
		fill_Method();

	}

	private static void fill_Method() {
		System.out.println("------fill Method-----");

		String[] fruits = { "Banana", "Orange", "Apple", "Mango" };
		Arrays.fill(fruits, "Kiwi");
		System.out.println("Kiwi will be added to every index--> " + Arrays.toString(fruits));

	}

	private static void equals_Method() {

		System.out.println("------equals Method-----");

		String[] car1 = { "Volvo", "BMW", "Tesla" };
		String[] car2 = { "Volvo", "BMW", "Tesla" };
		System.out.println("Returns true if equals--> " + Arrays.equals(car1, car2));

	}

	private static void compare_Method() {
		System.out.println("------compare Method-----");

		String[] car1 = { "Volvo", "BMW", "Tesla" };
		String[] car2 = { "Volvo", "BMW", "Tesla" };
		System.out.println("Returns 0 if equals--> " + Arrays.compare(car1, car2));

	}

	private static void sort_Method() {
		System.out.println("------sort Method-----");

		String[] cars = { "Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi" };
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));

	}

	private static void toString_Method() {
		System.out.println("------toString Method-----");

		int a[] = { 40, 69, 2, 1 };
		System.out.println(Arrays.toString(a));

	}

	private static void heterogeneous_Object_Creation() {
		System.out.println("------heterogeneous Object Creation------");

		Object val[] = { "Sapna Lohkare", 'A', 70.06f, 600 };

		for (int i = 0; i < val.length; i++) {
			System.out.print(val[i] + " ");

		}
		System.out.println();

	}

	private static void Accessing_2D_Array_By_For_Loop_Without_Length_Method() {

		System.out.println("------Accessing_2D_Array_By_For_Loop_Without_Length_Method---------");
		int[][] arr = { { 1, 2 }, { 4, 5 }, { 6, 7 } };
		// rows 0 to 2
		// column 0 to 1
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void Accessing_2D_Array_By_For_Each() {

		System.out.println("-----Accessing 2D Array By For Each-------");

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 6 } };

		for (int[] rows : myNumbers) {
			for (int i : rows) {
				System.out.print(i + " ");
			}
			System.out.println();

		}

	}

	private static void Accessing_2D_Array_By_For_Loop_With_Lenght_Method() {

		System.out.println("-----Accessing 2D Array By For Loop------");

		String[][] arr = { { "10th", "11th" }, { "12th", "13th" }, { "14th", "15th" }, { "16th" } };

		// rows 0 to 3
		// column 0 to 1
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

	private static void declairing_Multidimentional_Aarray() {
		System.out.println("-------2D array declairation without new keyword-------------"+"\n");
		System.out.println("int[][] arr1 = {{2,3,5},{6,9,0},{6,8,9}};");
		System.out.println("int[] arr2[] =  {{3,4,5},{2,7,1},{1,3,4}};");
		System.out.println("int arr3 [][] =  {{1,3,4},{6,9,0},{3,4,5}};");
		System.out.println("int [][]arr4 =  {{2,3},{6,9},{6,8}};");

		System.out.println("\n"+"-------2D array declairation with new keyword-------------");

		System.out.println("int[][] arr = new int[2][3];");

	}

}
