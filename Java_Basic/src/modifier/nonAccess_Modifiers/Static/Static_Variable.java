package modifier.nonAccess_Modifiers.Static;

//static variable can be directly access with class name
//does not need object to call in method or in constructor
public class Static_Variable {

	static String name = "Fujitsu";

	public static void main(String[] args) {
		// 2 ways to access static variable
		System.out.println("1) : " + name);
		System.out.println("2) : " + Static_Variable.name);

	}

}
