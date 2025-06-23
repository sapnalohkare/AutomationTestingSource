package this_;

//4. Using ‘this’ keyword as a method parameter

public class Usage_4 {

	 int a;
	    int b;
	 
	    // Default constructor
	    Usage_4()
	    {
	        a = 10;
	        b = 20;
	    }
	 
	    // Method that receives 'this' keyword as parameter
	    void display(Usage_4 obj)
	    {
	        System.out.println("a = " + obj.a
	                           + "  b = " + obj.b);
	    }
	 
	    // Method that returns current class instance
	    void get() { display(this); }
	 
	    
	public static void main(String[] args) 
	{
		Usage_4 object = new Usage_4();
		object.get();

	}

}
