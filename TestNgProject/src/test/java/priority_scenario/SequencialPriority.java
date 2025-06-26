package priority_scenario;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequencialPriority {
	@BeforeTest
	public void result()
	{
		
		System.out.println("runs in sequencial priority manner..  ");
	}
	
  @Test (priority = 1) 
  public void d() {
	  
	  System.out.println("method  : d...priority : 1");
  }
  @Test (priority = 2)
  public void c() {
	  System.out.println("method  : c... priority : 2");
  }
  @Test (priority = 3)
  public void b() {
	  System.out.println("method  : b...priority : 3");
  }
  @Test (priority = 4)
  public void a() {
	  System.out.println("method  : a...priority : 4");
  }
}
