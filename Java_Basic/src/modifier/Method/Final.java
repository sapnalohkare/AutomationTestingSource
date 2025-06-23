package modifier.Method;

//final methods cannot be overridden/modified
public class Final extends Company {

	public static void main(String[] args) {
		
		Final ob = new Final();
		 
		Final.password();
		ob.username();
	}

	/*// final method can not be overridden / modified
	 * 
	 * final void username() 
	 * { System.out.println("username : sapnaLohkare");
	 * 
	 * }
	 */
}

class Company {

	// final method can not be overridden / modified
	final void username() {
		System.out.println("username : sapnaLohkare");

	}

	// final method can not be overridden / modified
	static final void password() {
		System.out.println("password : 123456");

	}
}
