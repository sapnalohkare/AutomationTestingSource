package pageObjectModel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import resuasability.Basic_Reuse;

public class Execute  extends Basic_Reuse{
	
	
	
  @BeforeSuite
  public void BeforeSuite() {
	  
	  browserLaunch("Chrome");
	  hitURL("http://www.automationpractice.pl/index.php");
	  
  }
	
 
  @Test
  public void verify() {
	  
	  SignIn_POM_01 pom = new SignIn_POM_01(driver);
	  pom.accountVerification();
	  
  }
  
  @Test(dependsOnMethods = {"verify()"})
  public void createAccount() {
	  
	  CreateAccount_POM_02 pom = new CreateAccount_POM_02(driver);
	  pom.createAccount();
	  
  }
	
  @AfterSuite
  public void AfterSuite() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  driver.quit();
  }
}
