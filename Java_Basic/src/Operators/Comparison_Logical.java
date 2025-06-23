package Operators;

public class Comparison_Logical {
	
	/* byte, short, int, long, float, double, char, boolean, String, Array */

	// for Comparison operations
	int Val_01;
	int Val_02;
	boolean Result;

	// for logical operations
	static String name_01;
	static String name_02;
	boolean nameResult;

	public static void main(String[] args) {

		Comparison_Logical opObject = new Comparison_Logical();

		/************** Java Comparison Operators ***************/

		System.out.println("******** Java Comparison Operators ***********"+ "\n");

		// calling equalsMethod()
		opObject.equalsMethod();

		// calling NotEqualsMethod() method
		NotEqualsMethod();

		// calling NotEqualsMethod() method
		opObject.GreaterThanMethod();

		// calling LessThanMethod()
		LessThanMethod();

		// calling greaterThanOrEqualTo() method;
		opObject.greaterThanOrEqualTo();

		// calling lessThanOrEqualTo() method
		lessThanOrEqualTo();

		/******************** Java Logical Operators *****************/

		System.out.println("\n" + "******** Java Logical Operators ***********" + "\n");

		// calling logicalAndMethod() method
		logicalAndMethod();

		// calling logicalOrMethod() method
		opObject.logicalOrMethod();

		// calling logicalNotMethod()
		logicalNotMethod();
	}

	// == operator
	public boolean equalsMethod() {
		Val_01 = 60;
		Val_02 = 69;
		Result = Val_01 == Val_02;

		System.out.println("Equals Method result is --> " + Result);

		return Result;
	}

	// != operator
	static public boolean NotEqualsMethod() {

		Comparison_Logical opObject = new Comparison_Logical();

		opObject.Val_01 = 50;
		opObject.Val_02 = 50;
		opObject.Result = opObject.Val_01 != opObject.Val_01;

		System.out.println("Not Equals Method result is --> " + opObject.Result);

		return opObject.Result;
	}

	// > operator
	public boolean GreaterThanMethod() {
		Val_01 = 500;
		Val_02 = 489;
		Result = Val_01 > Val_02;

		System.out.println("Greater Than Method result is --> " + Result);

		return Result;
	}

	// < operator
	static public boolean LessThanMethod() {
		Comparison_Logical opObject = new Comparison_Logical();

		opObject.Val_01 = 300;
		opObject.Val_02 = 400;
		opObject.Result = opObject.Val_01 < opObject.Val_02;

		System.out.println("Less Than Method result is --> " + opObject.Result);

		return opObject.Result;
	}

	// >= operator
	public boolean greaterThanOrEqualTo() {

		Val_01 = 5;
		Val_02 = 3;
		Result = Val_01 >= Val_02;

		System.out.println("Greater than or equal to Method result is --> " + Result);

		return Result;
	}

	// < operator
	static public boolean lessThanOrEqualTo() {
		Comparison_Logical opObject = new Comparison_Logical();

		opObject.Val_01 = 700;
		opObject.Val_02 = 100;
		opObject.Result = opObject.Val_01 <= opObject.Val_02;

		System.out.println("Less than or equal to Method result is --> " + opObject.Result);

		return opObject.Result;
	}

	// && operator
	static public boolean logicalAndMethod() {
		Comparison_Logical opObject = new Comparison_Logical();

		name_01 = "STP";
		name_02 = "Infotech";
		
		opObject.nameResult = (name_01 == "STP" && name_02 == "Institute");

		System.out.println("Logical And Method result is --> " + opObject.nameResult);

		return opObject.nameResult;
	}

	// || operator
	public boolean logicalOrMethod() {
		Comparison_Logical opObject = new Comparison_Logical();

		name_01 = "STP";
		name_02 = "Infotech";

		opObject.nameResult = (name_01 == "STP" || name_02 == "Institute");

		System.out.println("Logical Or Method result is --> " + opObject.nameResult);

		return opObject.nameResult;
	}

	// ! logical Not operator
	static public boolean logicalNotMethod() {
		Comparison_Logical opObject = new Comparison_Logical();

		name_01 = "STP";
		name_02 = "Infotech";

		opObject.nameResult = !(name_01 == "STP" && name_02 == "Infotech");

		System.out.println("Logical Not Method result is --> " + opObject.nameResult);

		return opObject.nameResult;
	}

}
