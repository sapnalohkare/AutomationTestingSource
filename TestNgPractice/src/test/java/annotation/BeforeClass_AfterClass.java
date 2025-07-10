package annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_AfterClass {
	 @Test (description ="default test")
	  public void f() {
		  
		  System.out.println("Test F : ");
	  }
	  
	  @BeforeClass
	 public void intializingWebDriver() {
		  
		  System.out.println("BeforeClass used for :  intializing WebDriver");
	  }
	 
	 
	  @AfterClass
	 public void closingWebDriver() {
		  
		  System.out.println("AfterClass used for :  closing WebDriver");
	 }
}
