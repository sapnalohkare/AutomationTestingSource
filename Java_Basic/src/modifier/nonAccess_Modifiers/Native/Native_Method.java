package modifier.nonAccess_Modifiers.Native;


/*we can not  add implementation in the body.even after 
inheritance we can not add implementation details */

public 	class Native_Method extends car{

	public static void main(String[] args) {
		Native_Method ob = new Native_Method();
		
		ob.run();
	}
	    
	}

class car
{
	//native method can not have implementation also can not inherited
	native void run();
}