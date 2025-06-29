package listner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ListnerTestNG {
	
	 @Test
	  public void browserLaunch() {
		  System.out.println("browserLaunch method ...");
		  
	  }
	 
  @Test
  public void login() {
	  System.out.println("Login method ...");
	  
  }
  
  
  @Test
  public void search() {
	  System.out.println("search method ...");
	  
  }
  
  @Test
  public void logout() {
	  System.out.println("logout method ...");
	  
  }
  
  
}
