package annotation;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite {
  @Test
  public void f() {
	  
	  System.out.println("Test F : ");
  }
  
  @org.testng.annotations.BeforeSuite
 public void setUpDB() {
	  
	  System.out.println("DB connection opens......");
  }
 
 
  @AfterSuite
 public void closeDB() {
	  
	  System.out.println("DB connection close......");
 }
 
  
}
