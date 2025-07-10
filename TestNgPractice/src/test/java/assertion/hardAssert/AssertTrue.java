package assertion.hardAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AssertTrue {
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
		
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='name']")).isDisplayed(),"visible");
		//Assert.assertTrue(driver.findElement(By.xpath("//input[@id='name']")).isEnabled());
	 	//Assert.assertTrue(driver.findElement(By.xpath("//input[@id='name']")).isSelected(),"fail");
	}

}
