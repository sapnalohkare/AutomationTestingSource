package annotation_parameter;

import org.testng.annotations.Test;

public class description {
  @Test (description="informationrelated to method..")
  public void f() {
	  System.out.println("description= information related to method can be given....");
  }
}
