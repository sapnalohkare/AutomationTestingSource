package modifier.Method;


/*we can not  add implementation in the body.even after 
inheritance we can not add implementation details */

public 	class Native extends car{

	public static void main(String[] args) {
		Native ob = new Native();
		
		ob.run();
	}
	    
	}

class car
{
	//native method can not have implementation also can not inherited
	native void run();
}