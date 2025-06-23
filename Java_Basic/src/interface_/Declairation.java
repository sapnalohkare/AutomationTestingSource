package interface_;

public interface Declairation  
{
	 
	// declare constant fields  :-> public static final
    // declare methods that abstract   : ->  Public abstract
    // by default method
	//static methods : can be call like ( Interfacename.methodname )
}

interface Information
{
	
	int age = 90; /*compiler add : Public static final int age = 90*/
	String name ="Interface info"; /*compiler add : Public static final String name = "Interface info"*/
	
	//same as above...
	public static final char grade ='A';
	
	
	public void data(); /*public abstract void*/
	
	public String companyName();/*public abstract String*/
	
	public static int  salary()
	{
		return 30000;
	}
	
	
	


}