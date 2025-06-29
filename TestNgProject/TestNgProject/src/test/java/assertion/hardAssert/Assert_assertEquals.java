package assertion.hardAssert;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assert_assertEquals {

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
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	}

	@Test(priority = 2)
	public void verifyTittle() {

		System.out.println("Title of web page is : " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Selenium Practice - Student Registration Form");
	}

}
