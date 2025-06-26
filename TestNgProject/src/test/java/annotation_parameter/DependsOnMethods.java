package annotation_parameter;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	
	@Test(description = "imp method ")
	public void launchBrowser() {
		  System.out.println("launchBrowser method...!");
	  } 
	  
	  @Test(description = "hit url method ",dependsOnMethods = "launchBrowser()")
	  public void hitURL() {
		  System.out.println("hitURL method....!");
	  }
	  
	  @Test(dependsOnMethods = "hitURL()")
	  public void WebElement() {
		  System.out.println("WebElement method....!");
	  }
}
