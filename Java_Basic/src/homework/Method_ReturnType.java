package homework;
public class Method_ReturnType {

	/* byte, short,int, long,boolean ,char,string array */
	byte byteVal;
	short shortVal;
	int intVal;
	long longVal;
	boolean booleanVal;
	char charVal;
	String stringVal;
	static int[] arr;

	// Array return method
	public int[] arryaReturnMethod(int[] arrVal) {

		int[] arr = new int[arrVal.length];

		for (int i = 0; i < arrVal.length; i++) {
			arr[i] = arrVal[i];
			// System.out.println(arr[i]);
		}

		return arr;
	}

	// String return method
	public String stringReturnMethod(String name) {
		String lName = new String("Infotech");

		return stringVal = (name + " " + lName);
	}

	// boolean return method
	public char charReturnMethod(boolean condition, char grade) {
		if (condition == true) {
			charVal = 'B';
		}

		return charVal;
	}

	// boolean return method
	public boolean booleanReturnMethod(boolean b) {
		if (b == true) {
			booleanVal = false;
		}

		return booleanVal;
	}

	// long return method
	public long longReturnMethod(int a, int b) {
		longVal = a + b;

		return longVal;

	}

	// short return method
	public int intReturnMethod(int a, int b) {
		intVal = (a + b) * 100;

		return intVal;

	}

	// short return method
	public short shortReturnMethod() {

		return shortVal = 65 * 5;

	}

	// byte return method
	public byte byteReturnMethod() {
		byte a = 55;
		byte b = 5;

		byteVal = (byte) (a / b);

		return byteVal;

	}

	public static void main(String[] args) {

		Method_ReturnType mObject = new Method_ReturnType();
		System.out.println("byteReturnMethod return value is -->" + mObject.byteReturnMethod());
		System.out.println("shortReturnMethod return value is -->" + mObject.shortReturnMethod());
		System.out.println("intReturnMethod return value is -->" + mObject.intReturnMethod(500, 600));
		System.out.println("longReturnMethod return value is -->" + mObject.longReturnMethod(12000, 8000));
		System.out.println("booleanReturnMethod return value is -->" + mObject.booleanReturnMethod(10 > 7));
		System.out.println("charReturnMethod return value is -->" + mObject.charReturnMethod(60 < 100, 'A'));
		System.out.println("stringReturnMethod return value is -->" + mObject.stringReturnMethod("STP"));

		int[] array = { 3, 4, 5, 6, 7 };

		arr = mObject.arryaReturnMethod(array);
		System.out.println("Array elements are-->");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " , ");

		}

	}

}
