package annotation_parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AlwaysRun {
  @Test(alwaysRun = true)
  public void launchBrowser() {
	  System.out.println("launchBrowser method: alwaysRun = true");
  }
  
  @Test(alwaysRun =  false, dependsOnMethods = "Parameter()")
  public void logOut() {
	  System.out.println("logout alwaysRun : false");
  }
  
  @Test
  public void Parameter() {
	  System.out.println("Parameter enabled : true");
  }
  
  
}
