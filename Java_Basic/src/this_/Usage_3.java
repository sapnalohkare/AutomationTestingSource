package this_;

//3. Using ‘this’ keyword to return the current class instance 

public class Usage_3 {

	
	int a ;
	int b;
	
	 // Default constructor
	Usage_3()
    {
        a = 10;
        b = 20;
    }
	
	// Method that returns current class instance
	public Usage_3 get()
	 {
		 return this;
	 }
	public String getIdea()
	 {
		 return "main hu na";
	 }
	
	// Displaying value of variables a and b
    void display()
    {
        System.out.println("a = " + a + "  b = " + b);
    }
    
	public static void main(String[] args) 
	{
		
		Usage_3 object = new Usage_3();
	
		object.get().display();
	}

}
