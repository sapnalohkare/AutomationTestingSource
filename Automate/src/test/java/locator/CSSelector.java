package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//1)#elementID or input#idvalue
//2).className or tagname.classname
//3)input[type='email']
//4)tagName[attribute='value'][attribute2='value2']
//5)contains --> tagname[name*='value']
//6)starts with --> tagname[name^='starting  value']
//7)endswith --> tagname[name$='ending value']

public class CSSelector {

	public static void main(String[] args) throws Throwable {

		// WebElement fruit = driver.findElement(By.cssSelector("#fruits .tomatoes"));

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		CssSelector_elementID_01(driver);

		CssSelector_className_02(driver);

		CssSelector_Tagname_Attribute_Value_03(driver);
		
		CssSelector_Tagname_Multiple_Attribute_Value__04(driver);
		
		CssSelector_Tagname__Contains_05(driver);

		CssSelector_Tagname__StartsWith_06(driver);
		
		CssSelector_Tagname__EndsWith_07(driver);

		driverclosed(driver);

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
		System.out.println("contains : successfully accessed disabled element...!"+element);
		

	}

	// starts with --> tagname[name^="starting value"]
	private static void CssSelector_Tagname__StartsWith_06(WebDriver driver) throws Throwable {
		WebElement element = driver.findElement(By.cssSelector("input[value^='Readonly']"));
		System.out.println("starts with : successfully accessed read only element...!"+element);
		

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
