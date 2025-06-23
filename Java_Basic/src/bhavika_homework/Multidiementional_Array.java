package bhavika_homework;

public class Multidiementional_Array 
{
	public static void main(String[] args) {
		int r[] = new int[5];
		r[0] = 10;
		r[1] = 20;
		r[2] = 30;
		r[3] = 40;
		r[4] = 50;
		// for each
		for (int i : r) {
			System.out.println("The value of array is: " + i);
		}
		System.out.println("length of r is:" + r.length);
		System.out.println("index of r :" + r[4]);
		System.out.println("-----single dimensional array using for loop----");
		// for loop
		for (int j = 0; j < r.length; j++) {
			System.out.println("The value of array is:" + r[j]);
		}
		
		float f[] = new float[5];
		f[0] = 10.3f;
		f[1] = 12.3f;
		f[2] = 13.4f;
		f[3] = 14.3f;
		f[4] = 15.3f;

		for (float i : f) {
			System.out.println(i);
		}
		System.out.println("length of f is:" + f.length);
		System.out.println("index of 4 is:" + f[4]);
		System.out.println("------using for loop----");
		for (int j = 0; j < 5; j++) {
			System.out.println(f[j]);
		}
		
		String month_name[] = new String[5];
		month_name[0] = "January";
		month_name[1] = "February";
		month_name[2] = "March";
		month_name[3] = "April";
		month_name[4] = "May";

		for (String i : month_name) {
			System.out.println("Month name is:" + i);
		}
		System.out.println("length of month_name is:" + month_name.length);
		System.out.println("index of month_name 4 is:" + month_name[4]);
		for (int j = 0; j < 5; j++) {
			System.out.println(month_name[j]);
		}

	
		
		
	int digits[] = { 78, 34, 56, 67, 54, 34 };
	for (int i : digits) {
		System.out.println(i);
	}
	System.out.println("length of digits is:" + digits.length);

	System.out.println("index of digits is:" + digits[3]);

	System.out.println("-----using for loop----");
	for (int j = 0; j < digits.length; j++) {
		System.out.println(j);
	}

	String week_name[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	for (String i : week_name) {
		System.out.println(i);
	}
	System.out.println("length of week_name is:" + week_name.length);
	System.out.println("index of week_name 3 is:" + week_name[3]);
	System.out.println("-----using for loop-------");
	for (int i = 0; i < 7; i++) {
		System.out.println(week_name[i]);
	}


	
	float numbers[] = { 12.3f, 45.3f, 54.5f, 54.5f };
	for (float i : numbers) {
		System.out.println(i);
	}
	System.out.println("length of number is:" + numbers.length);
	System.out.println("index of numbers is:" + numbers[3]);

	System.out.println("-----using for loop----");
	for (int j = 0; j < 4; j++) {
		System.out.println(numbers[j]);
	}

	
	
	
	
	}

		

	}

	
	

	




