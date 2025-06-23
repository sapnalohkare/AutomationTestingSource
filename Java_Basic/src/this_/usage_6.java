package this_;

class usage_6 {
   
	int x = 5;
 
    // Default Constructor that create an object of A
    // with passing this as an argument in the
    // constructor
    usage_6() 
    {
    	A obj = new A(this);
    	System.out.println(obj);
    	
    }
 
    // method to show value of x
    void display()
    {
        System.out.println("Value of x in Class B : " + x);
    }
 
    public static void main(String[] args)
    {
    	usage_6 obj = new usage_6();
    	System.out.println(obj);
    }
}

//Java code for using this as an argument in constructor
//call
//Class with object of Class B as its data member
class A {
	usage_6 obj;

 // Parameterized constructor with object of B
 // as a parameter
 A(usage_6 obj)
 {
     this.obj = obj;

     // calling display method of class B
     obj.display();
 }
}
