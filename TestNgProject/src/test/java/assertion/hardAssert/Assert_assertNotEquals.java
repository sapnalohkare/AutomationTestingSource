package assertion.hardAssert;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assert_assertNotEquals {
	public static ChromeDriver driver = null;

	@BeforeSuite
	public void browserLaunch() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

	}

	@Test(priority = 1)
	public void verifyURL() {

		System.out.println("Actual URL  : " + driver.getCurrentUrl());
		Assert.assertNotEquals(driver.getCurrentUrl(),"wrong URL","this test should pass ");
	}

	
}
