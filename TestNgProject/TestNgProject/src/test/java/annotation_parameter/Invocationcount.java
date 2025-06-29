package annotation_parameter;

import org.testng.annotations.Test;

public class Invocationcount {
	
	 int i = 1;
  @Test(invocationCount = 2,description = "method will be call for two times..")
  public void dataMethod() {
	  System.out.println("data method :---");
	  System.out.println("method call : "+i );
	  i++;
  }
 
}
