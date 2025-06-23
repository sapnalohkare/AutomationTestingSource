package site;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		login(driver);

	    logout(driver);
	    
	    close(driver);

	}

	private static void close(WebDriver driver) {
		
		driver.close();
	}

	private static void logout(WebDriver driver) throws Throwable 
	{
	
		
		WebElement allBtn = driver.findElement(By.id("react-burger-menu-btn"));
		allBtn.click();
		
		Thread.sleep(4000);
		WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
		logout.click();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}

	
	private static void login(WebDriver driver) throws Throwable {

		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();

		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));

		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));

		String actualMessage = error.getText();
		String expectedMessage = "Epic sadface: Username is required";

		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Test Passed: Error message verified successfully.");
			Thread.sleep(4000);
			userName.sendKeys("standard_user");
			password.sendKeys("secret_sauce");

		}

		String entered_Username = userName.getAttribute("value");
		
		String entered_Password = password.getAttribute("value");

		System.out.println(entered_Username + " " + entered_Password);

		if ((entered_Username.equals("standard_user") || entered_Username.equals("locked_out_user")
				|| entered_Username.equals("problem_user") || entered_Username.equals("performance_glitch_user")
				|| entered_Username.equals("error_user") || entered_Username.equals("visual_user"))
				&& (entered_Password.equals("secret_sauce"))) {

			Thread.sleep(4000);

			System.out.println("Test Passed: Username and Password  verified successfully.");
			login.click();

		}

	}

}
