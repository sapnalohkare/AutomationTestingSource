package locator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.Select;

/*/html/body/main/div/form/div/div[2]/label[1]/select*/
public class XPath_Absolute {

	public static void main(String[] args) throws Throwable {

		// XPath_Absolute obj = new XPath_Absolute();
		// full xpath : /html/body/main/div/form/div/div[1]/div/a
		// relative xpath :
		// https://the-internet.herokuapp.com/inputs

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");

		WebElement element = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select"));

		Select oSelect = new Select(element);
		oSelect.selectByContainsVisibleText("Two");

		Thread.sleep(4000);

		driver.close();

	}

	public void ByAllTest() {
		// Create instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		// Navigate to Url
		driver.get("https://www.selenium.dev/selenium/web/login.html");

		// get both logins
		By example = new ByAll(By.id("password-field"), By.id("username-field"));
		List<WebElement> login_inputs = driver.findElements(example);

		// send them both input
		login_inputs.get(0).sendKeys("username");
		login_inputs.get(1).sendKeys("password");
	}
}
