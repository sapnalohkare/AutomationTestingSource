package interface_;

/*------Important------------------*/

/* 1) Class : Class  :-> Class extends Class
 * 2) Class : interface  :->  Class implement interface
 * 3) interface : interface :-> interface extends interface 
 */


/*------Important------------------*/

/* 1) variable : public static final.
 * 2) Methods : Public abstract 
 */

//Another way to achieve abstraction in Java, is with interfaces.

	/* 1) we can declare static method : static method can be access with interface name  like ( Interfacename.methodname )
	 * 2) we can declare Instance method  : but can not  have body
	 * 3) we can declare abstract method  
	 * 
	 */

	
public class Relationship_01 implements Employee
{

	
	
	public static void main(String[] args) 
	{
		Relationship_01 object = new Relationship_01();
		object.data();
		System.out.println(object.companyName());
		
		//parent interface static method calling
		System.out.println("salary : " +Employee.salary());
	}
	
	
	
	@Override
	public void data() 
	{
		System.out.println("name : Shramik  , salary : 40,000");
		
	}

	@Override
	public String companyName() {
		
		return "company name : wipro";
	}

}
interface Employee
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