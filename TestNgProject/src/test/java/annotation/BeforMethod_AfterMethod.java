package annotation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforMethod_AfterMethod {
	 @Test (description ="default test")
	  public void f() {
		  
		  System.out.println("Test F : ");
	  }
	  
	  @BeforeMethod
	 public void toGetURL() {
		  
		  System.out.println("BeforeMethod used for :  To Get URL");
	  }
	 
	 
	  @AfterMethod
	 public void callsAfterMethod() {
		  
		  System.out.println("AfterMethod call every time after test");
	 }
}
