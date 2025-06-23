package array;

public class Average {

	public static void main(String[] args) {
		
		int[] num = { 2, 4, 6, 8, 10, 12, 14 };

		int sum = 0, average;

		for (int i = 0; i < num.length; i++) 
		{
			sum = sum + num[i];
		}

		average = sum / num.length;

		System.out.println("Average is --> " + average);

	}

}
