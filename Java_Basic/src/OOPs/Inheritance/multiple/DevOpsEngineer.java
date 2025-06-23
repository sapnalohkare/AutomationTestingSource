package OOPs.Inheritance.multiple;

public class DevOpsEngineer implements Coder,Tester
{

	public static void main(String[] args)
	{
		DevOpsEngineer DevOpsEngineer_object = new DevOpsEngineer();
		DevOpsEngineer_object.writeCode();
		DevOpsEngineer_object.testCode();
		DevOpsEngineer_object.diploy();
		

	}

	@Override
	public void testCode() {
		System.out.println("DevOps Engineer tests automated scripts.");
	}

	@Override
	public void writeCode() {
		
		 System.out.println("DevOps Engineer writes automation scripts.");
	}

	
	public void diploy()
	{
		 System.out.println("DevOps Engineer diploy code on server.");
	}
}
