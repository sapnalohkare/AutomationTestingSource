package annotation_parameter;

import org.testng.annotations.Test;

public class Priority {
  @Test(priority =1)
  public void c() {
	  System.out.println("priority = 1 : c method ");
  }
  
  @Test(priority =2)
  public void b() {
	  System.out.println("priority = 2 : b method ");
  }
}
