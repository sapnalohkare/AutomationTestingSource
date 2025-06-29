package annotation_parameter;

import org.testng.annotations.Test;

public class Enabled {
	@Test(priority =1 , enabled = false,description = "this method will not run..")
	  public void c() {
		  System.out.println("priority = 1 : c method ");
	  }
	  
	  @Test(priority =2,enabled = true,description = "by default all methods are enabled..")
	  public void b() {
		  System.out.println("priority = 2 : b method ");
	  }
}
