package annotation_parameter;

import org.testng.annotations.Test;

public class Group_01 {
	
	
	 @Test(groups = {"High"},priority = 1)
	  public void hitUrl() {
		  System.out.println("hitUrl : High ");
	  }
	  
	  @Test(groups = {"High"},priority = 2)
	  public void login() {
		  System.out.println("login : High");
	  }
	  
	  @Test(groups = {"High"},priority = 3)
	  public void addtocart() {
		  System.out.println("addtocart : High");
	  }
	  

		 @Test(groups = {"Low"},priority = 1,dependsOnGroups = {"High"})
		  public void DBConnect() {
			  System.out.println("DBConnect : Low ");
		  }
		  
		  @Test(groups = {"Low"},priority = 2,dependsOnGroups = {"High"})
		  public void queryFired() {
			  System.out.println("queryFired : Low");
		  }
		  
		  @Test(groups = {"Low"},priority = 3,dependsOnGroups = {"High"})
		  public void dataSend() {
			  System.out.println("dataSend : Low");
		  }
}
