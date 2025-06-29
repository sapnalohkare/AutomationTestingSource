package annotation;

import org.testng.annotations.Test;

public class BeforeTest {
  @Test
  public void f() {
  }
  
  
  @org.testng.annotations.BeforeTest
  public void loadingData() {
	  System.out.println("Used to load test data.." );
  }
  
  
  
  
}
