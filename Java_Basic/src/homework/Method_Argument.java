package homework;

public class Method_Argument {


	boolean boolVl; 
	static char charVal;
	static int intVal;
	static long longVal, result;
	float floatVal;
	double doubleVal, doubleResult;

	public static void main(String[] args) 
	{
		Method_Argument mObject = new Method_Argument();
		
		mObject.floatAndDoubleAsAnArgument(500.500f, 100.500d);// float and double as an argument

		mObject.intAndLongAsAnArgument(30, 50986); // Integer and long as an argument
		
		mObject.booleanAsAnArgument(70.005f < 90.00785d); // boolean as an argument
		
		chracterAsAnArgument('B'); // character as an argument
		
		mObject.stringAsAnArgument("STP", "Infotech");// string as an argument
		
		int arr[] = { 300, 50, 59, 2, 9 }; // array an an argument
		arrayAsArgumet(arr);
		System.out.println("\n");

		

	}
    
	// float and double as an argument
	public void floatAndDoubleAsAnArgument(float a, double b) {
		floatVal = a;
		doubleVal = b;
		doubleResult = a % b;
		//return;

		System.out.println("float and double As an Arg. result-->" + doubleResult);
	}
    
	// Integer and long as an argument
	public void intAndLongAsAnArgument(int a, long b) {
		intVal = a;
		longVal = b;
		result = a * b;

		System.out.println("int and long As an Arg. result-->" + result);
	}

	// passing Array as an argument
	public static void arrayAsArgumet(int[] array) {
		System.out.println("passing array as an argument and content are:-> ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " , ");

			if (array.length == array.length) {
				System.out.print(array[i]);
			}
		}

	}

	// String as an argument
	public void stringAsAnArgument(String Fname, String Sname) {
		String fisrtVal = Fname; // fisrtVal,secondVal -->local variable
		String secondVal = Sname;

		if (fisrtVal == null || secondVal == null) {
			System.out.println("Error:- please pass valid name it can not be null");
		}

		if (fisrtVal == " " || secondVal == " ") {
			System.out.println("Error:- please pass valid name it can not be space");
		}

		if ((fisrtVal == secondVal) && !(fisrtVal == null && secondVal == null)) {
			System.out.println("Error:- please check both enter name is Same");
		}

		if ((fisrtVal != secondVal) && (fisrtVal != null && secondVal != null)) {
			System.out.println("String as an argument result -->"+fisrtVal+" "+secondVal);
		}

	}

	// char as an argument
	public static void chracterAsAnArgument(char grade) {

		charVal = grade;

		if (charVal == 'A') {
			System.out.println("Char as an argument result is -> A");
		} else if (charVal == 'B') {
			System.out.println("Char as an argument result is -> B");
		} else {
			System.out.println("Your grade is different than A and B");

		}

	}

	// boolean as an argument
	public void booleanAsAnArgument(boolean val) {
		boolVl = val;
		System.out.println("Boolean as Argument result :-> " + boolVl);

	}

}
