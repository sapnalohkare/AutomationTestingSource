package assertion.softAssert;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertAll {
	
	public static ChromeDriver driver = null;
	  @Test
	  public void launchBrowser() {
		  
		  driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			String expectedURL = "https://www.selenium.dev/";//make some change here
			String actualURL = driver.getCurrentUrl();
			
			SoftAssert sAsser = new SoftAssert();
			sAsser.assertEquals(expectedURL, actualURL); //not showing error cosidering minute
			sAsser.assertAll(); //shows error
		
}
}
