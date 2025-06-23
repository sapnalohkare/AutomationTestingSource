package this_;

public class Two_CallMethod {
	//2)this can be used to invoke current class method (implicitly)
	 public void m()
	    {
	    	System.out.println("Hello m");
	    	//n();//same as this.n() 
	        this.n();
	    	
	    }
	 
	 public void n()
	    {
	    	System.out.println("Hello n");
	    }
	 
	 
	public static void main(String[] args) 
	{
		
		Two_CallMethod object = new Two_CallMethod();
		object.m();
	}

}
