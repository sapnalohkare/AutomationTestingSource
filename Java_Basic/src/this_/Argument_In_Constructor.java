package this_;

public class Argument_In_Constructor
{
	A4 obj;
	Argument_In_Constructor(A4 obj)
	{
	  this.obj =obj;
	}
	
	void display() {
        System.out.println(obj.data);
    }

class A4 
{

	public String data;
	 A4(){    
		 Argument_In_Constructor b=new Argument_In_Constructor(this);    
		   b.display();    
		  }   
	
}
    
    class Main {    
    	  int data=10;    
    	  Main()
    	 {    
    		// Argument_In_Constructor b=new Argument_In_Constructor(this);    
    	   //b.display();    
    	  }    
}
}