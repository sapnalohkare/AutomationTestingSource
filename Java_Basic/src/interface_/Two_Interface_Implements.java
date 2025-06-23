package interface_;

public class Two_Interface_Implements implements Use_01 {

	public static void main(String[] args) 
	{
		
	     new Two_Interface_Implements().use_01();
	     new Two_Interface_Implements().use_02();
		
		
	}

	@Override
	public void use_01() {
		
		System.out.println("Use_01 : Method");
	}

	@Override
	public void use_02() {
		
		System.out.println("Use_02 : Method");
	}

}

interface Use_01 extends Use_02
{
	
 public void use_01(); 
}
interface Use_02
{
	
 public void use_02(); 
}