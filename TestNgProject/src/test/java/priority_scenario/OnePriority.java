package priority_scenario;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OnePriority {
	@BeforeTest
	public void result()
	{
		
		System.out.println("one priority :  runs test d : at  last : ");
	}
	
  @Test (priority = 1)
  public void d() {
	  
	  System.out.println("method  : d...");
  }
  @Test
  public void c() {
	  System.out.println("method  : c...");
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
