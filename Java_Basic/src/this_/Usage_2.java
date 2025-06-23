package this_;

//Using this() to invoke current class constructor

public class Usage_2 {
 
	int a;
    int b;
 
    // Default constructor
    Usage_2()
    {
        this(10, 20);
        System.out.println("Inside  default constructor \n");
    }
 
    // Parameterized constructor
    Usage_2(int a, int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }
    
	
	
	public static void main(String[] args) 
	{
		
		Usage_2 object = new Usage_2();
		System.out.println(object);//to remove warning..
	}

}
