package annotation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BeforeTest_AfterTest {
	 @Test (description ="default test")
	  public void f() {
		  
		  System.out.println("Test F : ");
	  }
	  
	  @org.testng.annotations.BeforeTest
	 public void loadingTestData() {
		  
		  System.out.println("BeforeTest used for : loading Test Data.....");
	  }
	 
	 
	  @AfterTest
	 public void closeLoadingTestData() {
		  
		  System.out.println("AfterTest used for : closing loading Test Data.....");
	 }
}
