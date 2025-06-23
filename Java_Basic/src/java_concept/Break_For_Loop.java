package java_concept;

public class Break_For_Loop 
{
  public static void main(String[] args) 
  {
	for (int i = 1; i<=10; i++)
	{
		
//		if (i==4)
//		{
//			break;
//		}
		
		if (i==6)
		{
			System.out.println("continue from "+i);
			continue;
		}
		System.out.println("print value " + i );
	}
	System.out.println("I am out of loop now");
  }
}
