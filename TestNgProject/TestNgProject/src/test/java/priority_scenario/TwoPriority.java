package priority_scenario;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TwoPriority {
	@BeforeTest
	public void result()
	{
		
		System.out.println("two priority :  runs two test cases at last like : priority - 1 first  and   priority - 2 second : but at  last : ");
	}
	
  @Test (priority = 1)
  public void d() {
	  
	  System.out.println("method  : d...priority : 1");
  }
  @Test (priority = 2)
  public void c() {
	  System.out.println("method  : c... priority : 2");
  }
  @Test
  public void b() {
	  System.out.println("method  : b...");
  }
  @Test
  public void a() {
	  System.out.println("method  : a...");
  }
}
