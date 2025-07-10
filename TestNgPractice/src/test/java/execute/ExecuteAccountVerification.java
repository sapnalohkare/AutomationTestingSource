package execute;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageObjectModel.SignIn_POM_01;
import resuasability.Basic_Reuse;

public class ExecuteAccountVerification  extends Basic_Reuse{
	
	
	
  @BeforeSuite
  public void BeforeSuite() {
	  
	  browserLaunch("Chrome");
	  hitURL("http://www.automationpractice.pl/index.php");
	  
  }
	
 
  @Test(priority = 1)
  public void verify() {
	  
	  SignIn_POM_01 pom = new SignIn_POM_01(driver);
	  pom.accountVerification();
	  
  }
  
  /*@Test(priority = 2)
  public void accountVerify() {
	  
	  POM_02 pom = new POM_02(driver);
	  pom.createAccount();
	  
  
}*/
	
  @AfterSuite
  public void AfterSuite() {
	  
	 // driver.quit();
  }
}
