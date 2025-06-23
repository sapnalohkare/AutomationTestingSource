package site;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webform_Methods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());

		locateElementByID(driver);

		locateElementByName(driver);

		locateElementByClassName(driver);

		locateElementByTagName(driver);

		locateElementByLinkText(driver);

		locateElementByPartialLinkText(driver);

		locateElementBy_XPath_Absolute(driver);

		locateElementBy_XPath_Relative(driver);

		/*-----------------All Css Locators----------------*/

		CssSelector_elementID_01(driver);

		CssSelector_className_02(driver);

		CssSelector_Tagname_Attribute_Value_03(driver);

		CssSelector_Tagname_Multiple_Attribute_Value__04(driver);

		CssSelector_Tagname__Contains_05(driver);

		CssSelector_Tagname__StartsWith_06(driver);

		CssSelector_Tagname__EndsWith_07(driver);

		driverclosed(driver);

	}

	private static void locateElementBy_XPath_Relative(WebDriver driver) throws Throwable {
		WebElement element = driver.findElement(By.xpath("//input[@name='my-datalist']"));
		element.sendKeys("New York");
		Thread.sleep(4000);

	}

	private static void locateElementBy_XPath_Absolute(WebDriver driver) throws Throwable {
		
		WebElement element = driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select"));

		Select oSelect = new Select(element);
		oSelect.selectByContainsVisibleText("Two");

		Thread.sleep(4000);

	}

	private static void locateElementByPartialLinkText(WebDriver driver) throws Throwable {
		WebElement linkText = driver.findElement(By.partialLinkText("to index"));
		linkText.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);

	}

	private static void locateElementByLinkText(WebDriver driver) throws Throwable {
		WebElement linkText = driver.findElement(By.linkText("Return to index"));
		linkText.click();
		Thread.sleep(4000);
		driver.navigate().back();
	}

	private static void locateElementByName(WebDriver driver) throws Throwable {
		WebElement element = driver.findElement(By.name("my-password"));
		element.sendKeys("MyPassword@1234");
		Thread.sleep(3000);

	}

	private static void locateElementByTagName(WebDriver driver) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();

		driver.navigate().back();
		Thread.sleep(5000);

	}

	private static void locateElementByClassName(WebDriver driver) throws Throwable {

		WebElement allSearch = driver.findElement(By.className("form-select"));

		Select oselect = new Select(allSearch);

		oselect.selectByVisibleText("Three");

		System.out.println("option selected successfully......!");

		Thread.sleep(4000);

	}

	private static void locateElementByID(WebDriver driver) throws Throwable {

		WebElement email = driver.findElement(By.id("my-text-id"));
		email.sendKeys("sapnalohkare92@gmail.com");

		Thread.sleep(4000);

		System.out.println("email entered successfully.....!");

	}

	/*---------------------CSS selector methods-------------------------*/

	// #elementID
	private static void CssSelector_elementID_01(WebDriver driver) throws Throwable {

		WebElement allSearch = driver.findElement(By.cssSelector("#my-text-id"));
		allSearch.sendKeys("sapna lohkare");
		Thread.sleep(2000);
		allSearch.clear();
		Thread.sleep(2000);

	}

	// 1) .className
	private static void CssSelector_className_02(WebDriver driver) throws Throwable {

		WebElement allSearch = driver.findElement(By.cssSelector(".form-control"));
		allSearch.sendKeys("Sapna Lohkare Basande");
		Thread.sleep(2000);

	}

	// input[type='email']
	private static void CssSelector_Tagname_Attribute_Value_03(WebDriver driver) throws Throwable {
		WebElement allSearch = driver.findElement(By.cssSelector("input[type='password']"));
		allSearch.sendKeys("Sapna@9255");
		Thread.sleep(2000);
	}

	// tagName[attribute='value'][attribute2='value2']"
	private static void CssSelector_Tagname_Multiple_Attribute_Value__04(WebDriver driver) throws Throwable {

		WebElement element = driver.findElement(By.cssSelector("textarea[class='form-control'][name='my-textarea']"));
		element.sendKeys("All details about automation testing : automation testing is fun...");
		Thread.sleep(2000);

	}

	// contains --> tagname[name*=value]
	private static void CssSelector_Tagname__Contains_05(WebDriver driver) throws Throwable {

		WebElement element = driver.findElement(By.cssSelector("input[name*='disabled']"));
		System.out.println("contains : successfully accessed disabled element...!" + element);

	}

	// starts with --> tagname[name^="starting value"]
	private static void CssSelector_Tagname__StartsWith_06(WebDriver driver) throws Throwable {
		WebElement element = driver.findElement(By.cssSelector("input[value^='Readonly']"));
		System.out.println("starts with : successfully accessed read only element...!" + element);

	}

	// endswith --> tagname[name$="ending value"]
	private static void CssSelector_Tagname__EndsWith_07(WebDriver driver) throws Throwable {
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.cssSelector("a[href$='.html']"));
		element.click();
		Thread.sleep(5000);
		driver.navigate().back();

	}

	private static void driverclosed(WebDriver driver) {

		driver.close();

	}

}
