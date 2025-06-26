package testNg;

import org.testng.annotations.Test;

public class Priority {
 
	//if no priority given then execute alphabetically: 
	//priority starts from : 0 with other priority
	//if set priority 0 given : then ignores priority and execute alphabetically
	//if only priority : 1 is given then it will execute at last : if priority not given to others
	
	
	@Test(priority = 2)
  public void priorityMethod_01() {
	  
	  System.out.println("priorityMethod_01 : 2");
  
}
	@Test(priority = 1)
public void priorityMethod_02() {
	
	System.out.println("priorityMethod_02 : 1");
}
	
	@Test(priority = 0)
	  public void priorityMethod() {
		  
		  System.out.println("priorityMethod");
	  
	}
}

