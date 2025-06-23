package interface_;

public class Diamond_Problem implements A,B{

	
	String name = "Infosys";
	
	public static void main(String[] args) 
	{
		
		/*solution 1 : even both interface have same method :-> but implementation is given by child so
		only one implement method will be there*/
		
		Diamond_Problem object = new Diamond_Problem();
		object.print();
		
		/*solution 2 : static method belongs to interface not to class which implements so both write are different*/
		A.write();
		B.write();
	}

	@Override
	public void print() 
	{
		System.out.println("Print method : Diamond_Problem class ");
		
	}

}

interface A
{
	public static final String name = "Fujitsu";
	
	public abstract void print(); /*public abstract */
	
	public static void write()
	{
		System.out.println("Interface A : write method ");
		
	}
	
}

interface B
{
	public static final String name = "Genpact";
	
	public abstract void print(); /*public abstract */
	
	public static void write()
	{
		
		System.out.println("Interface B : write method ");
	}
	
}