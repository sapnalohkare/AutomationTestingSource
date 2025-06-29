package annotation_parameter;

import org.testng.annotations.Test;

public class Group_02 {
  @Test(groups = {"Medium"},priority = 1)
  public void trackOrder() {
	  System.out.println("trackOrder : Medium ");
  }
  
  @Test(groups = {"Medium"},priority = 2)
  public void payment() {
	  System.out.println("payment : Medium");
  }
  
  @Test(groups = {"Medium"},priority = 3)
  public void logout() {
	  System.out.println("logout : Medium");
  }
}
