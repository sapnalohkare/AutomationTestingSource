package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
 
 @Test
  public void f() {
	  System.out.println("F Test :");
  }
  
  @Test
  public void P() {
	  System.out.println("P Test :");
  }
  
  @BeforeSuite
  public void f0() {
	  System.out.println("@BeforeSuite :");
  }
  
  @BeforeTest
  public void f1() {
	  System.out.println("@BeforeTest :");
  }
  @BeforeClass
  public void f3() {
	  System.out.println("@BeforeClass :");
  }
  @BeforeMethod
  public void fA() {
	  System.out.println("@BeforeMethod :");
  }
  
  /*-------------after------------------*/
  @AfterMethod
  public void fB() {
	  System.out.println("@@AfterMethod :");
  }
  @AfterClass
  public void fC() {
	  System.out.println("@@AfterClass :");
  }
  @AfterTest
  public void fD() {
	  System.out.println("@@AfterTest :");
  }
  @AfterSuite
  public void fE() {
	  System.out.println("@@AfterSuit :");
  }
  
}
