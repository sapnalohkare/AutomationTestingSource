package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	// tagname[@atrribute='value']
	// tagname[@atrribute1='value1'][@atrribute2='value2']u
	// (tagname[@atrribute="value"])[1]---if values are multiple 15
	// tagname[contains(@attribute,constantvalue)]
	// tagname[starts-with(@attribute,constantvalue)]
	// AND operation// tagname[@atrribute1="value1" and @atrribute2="value2"]
	// OR operation// tagname[@atrribute1="value1" or @atrribute2="value2"]
	// XPath using text()

	/*-----------------Parent-Child-Relation--------------------------------------*/

	// parenttagname[@parentatrribute='value']//childtagname[@childatrribute='value']
	/*
	 * ex://select[@id='searchDropdownBox']//option[@value='search-alias=automotive']
	 * 
	 */

	// to get self node-->// tagname[@atrribute="value"]//self::currenttagname
	/* ex: //option[@value='search-alias=amazon-devices']//self::option */

	// select parent node: from
	// child-->//childtagname[@childattribut='value']//parent::parenttagname
	/* //option[@value='search-alias=appliances']//parent::select */

	// select child node: from
	// parent-->//parenttagname[@parentattribut='value']//child::childtagname
	/* (//select[@id='searchDropdownBox']//child::option)[14] */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.amazon.in/");

		xpath_Tagname_Atrribute_Value(driver);
		xpath_Tagname_Multiple_Atrribute_Value(driver);
		xpath_Tagname_Atrribute_Value_SelectOneFromMultiple(driver);
		xpath_Tagname_Atrribute_Value_AND_Atrribute_Value(driver);
		xpath_Tagname_Atrribute_Value_OR_Atrribute_Value(driver);
		xpath_Tagname_Contains_Atrribute_Value(driver);
		xpath_Tagname_Starts_With_Atrribute_Value(driver);
		XPath_Using_Text(driver);

		/*--------parent-child-relationship-------------*/

		xpath_From_Parent_To_Child(driver);
		xpath_Self(driver);
		xpath_Parent(driver);
		xpath_Child(driver);

		driver.close();

	}

	


	private static void xpath_Tagname_Atrribute_Value(WebDriver driver) {
		// tagname[@atrribute="value"]

		WebElement element_01 = driver.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress']"));
		WebElement element_02 = driver.findElement(By.xpath("//input[@value='Go']"));
		WebElement element_03 = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_buy_again']"));
		WebElement element_04 = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='HamburgerMenuDesktop']"));
		WebElement element_05 = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav']"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}

	private static void xpath_Tagname_Multiple_Atrribute_Value(WebDriver driver) {
		// tagname[@atrribute1="value1"][@atrribute2="value2"]

		WebElement element_01 = driver
				.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress'][@data-addnewaddress='add-new']"));
		WebElement element_02 = driver
				.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_8'][@data-csa-c-content-id='nav_cs_hi']"));
		WebElement element_03 = driver.findElement(
				By.xpath("//a[@data-csa-c-content-id='nav_cs_buy_again'][@data-csa-c-content-id='nav_cs_buy_again']"));
		WebElement element_04 = driver
				.findElement(By.xpath("//a[@data-csa-c-slot-id='HamburgerMenuDesktop'][@role='button']"));
		WebElement element_05 = driver
				.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav'][@class='nav-a  ']"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}

	private static void xpath_Tagname_Atrribute_Value_SelectOneFromMultiple(WebDriver driver) {

		// (tagname[@atrribute="value"])[1]---if values are multiple 15

		WebElement element_01 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[32]"));
		WebElement element_02 = driver.findElement(By.xpath("//input[@value='Go']"));
		WebElement element_03 = driver.findElement(By.xpath("(//input[@type='hidden'])[3]"));
		WebElement element_04 = driver.findElement(By.xpath("(//div[@class='nav-div'])[5]"));
		WebElement element_05 = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[4]"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}

	private static void xpath_Tagname_Atrribute_Value_AND_Atrribute_Value(WebDriver driver) {
		// AND operation// tagname[@atrribute1="value1" and @atrribute2="value2"]
		// a[@data-csa-c-content-id='nav_avod_desktop_topnav' and @class='nav-a ']

		WebElement element_01 = driver
				.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress' and @data-addnewaddress='add-new']"));
		WebElement element_02 = driver
				.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_8'and @data-csa-c-content-id='nav_cs_hi']"));
		WebElement element_03 = driver.findElement(
				By.xpath("//a[@data-csa-c-content-id='nav_cs_buy_again' and @data-csa-c-slot-id='nav_cs_2']"));
		WebElement element_04 = driver
				.findElement(By.xpath("//a[@data-csa-c-slot-id='HamburgerMenuDesktop'and @role='button']"));
		WebElement element_05 = driver
				.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav' and @class='nav-a  ']"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}

	private static void xpath_Tagname_Atrribute_Value_OR_Atrribute_Value(WebDriver driver) {
		// OR operation// tagname[@atrribute1="value1" or @atrribute2="value2"]

		WebElement element_01 = driver
				.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress' or @-addnewaddress='add-new']"));
		WebElement element_02 = driver
				.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_8' or @-csa-c-content-id='nav_cs_hi']"));
		WebElement element_03 = driver.findElement(
				By.xpath("//a[@data-csa-c-content-id='nav_cs_buy_again' or @data-csa-c-slot-id='nav_cs_2']"));
		WebElement element_04 = driver
				.findElement(By.xpath("//a[@id='nav-global-location-popover-link' or @ole='button']"));
		WebElement element_05 = driver
				.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav' or @clss='nav-a ']"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}

	private static void xpath_Tagname_Contains_Atrribute_Value(WebDriver driver) {
		// tagname[contains(@attribute,”signin”)]

		WebElement element_01 = driver.findElement(By.xpath("//input[contains(@id,'unifiedLocation1ClickAddress')]"));
		WebElement element_02 = driver.findElement(By.xpath("//input[contains(@value,'Go')]"));
		WebElement element_03 = driver
				.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_cs_buy_again')]"));
		WebElement element_04 = driver
				.findElement(By.xpath("//a[contains(@data-csa-c-slot-id,'HamburgerMenuDesktop')]"));
		WebElement element_05 = driver
				.findElement(By.xpath("//a[contains(@data-csa-c-content-id,'nav_avod_desktop_topnav')]"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
	}

	private static void XPath_Using_Text(WebDriver driver) {

		// tagname[text()=’Text of the WebElement’]

		WebElement element_01 = driver.findElement(By.xpath("//a[text()='MX Player']"));
		WebElement element_02 = driver.findElement(By.xpath("//a[text()='Sell']"));
		WebElement element_03 = driver.findElement(By.xpath("//a[text()='Buy Again']"));
		WebElement element_04 = driver.findElement(By.xpath("//a[text()='AmazonBasics']"));
		WebElement element_05 = driver.findElement(By.xpath("//a[text()='Books']"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}

	private static void xpath_Tagname_Starts_With_Atrribute_Value(WebDriver driver) {

		// tagname[contains(@attribute,”signin”)]

		WebElement element_01 = driver
				.findElement(By.xpath("//input[starts-with(@id,'unifiedLocation1ClickAddress')]"));
		WebElement element_02 = driver.findElement(By.xpath("//input[starts-with(@value,'Go')]"));
		WebElement element_03 = driver
				.findElement(By.xpath("//a[starts-with(@data-csa-c-content-id,'nav_cs_buy_again')]"));
		WebElement element_04 = driver
				.findElement(By.xpath("//a[starts-with(@data-csa-c-slot-id,'HamburgerMenuDesktop')]"));
		WebElement element_05 = driver
				.findElement(By.xpath("//a[starts-with(@data-csa-c-content-id,'nav_avod_desktop_topnav')]"));

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
	}
	
	private static void xpath_From_Parent_To_Child(WebDriver driver) {
		driver.get(
				"https://www.jeevansathi.com/?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gad_campaignid=17875803482&gbraid=0AAAAADzDvYYnbSN1LzgFWA8Ov0hKsJovB&gclid=CjwKCAjw3f_BBhAPEiwAaA3K5LpBbYsZsuXjOup-JUzeaQEFpTL2c8Pa0LjFVCu6r8AAzgYeOOpQGBoCdvcQAvD_BwE");

		// parenttagname[@parentatrribute='value']//childtagname[@childatrribute='value']
		
		WebElement element_01 = driver.findElement(By.xpath("//ul[@class='jsx-45f4e8f85b895f2d listnone liHover f14 drop_D']//li[@class='jsx-45f4e8f85b895f2d']"));
		WebElement element_02 = driver.findElement(By.xpath("//(//ul//li[@class='py-3 pl-4 text-sm text-white hover:bg-primary-500'])[2]"));
		WebElement element_03 = driver.findElement(By.xpath("//ul[@class='jsx-533fb47c0e370edb clearfix pt10 pb5']//li[@id='Bihari']//a[@title='Bihari Matrimony']"));
		WebElement element_04 = driver.findElement(By.xpath("//ul[@class='jsx-533fb47c0e370edb clearfix pt10 pb5']//li[@id='Konkani']"));
		WebElement element_05 = driver.findElement(By.xpath("//ul[@class='jsx-533fb47c0e370edb clearfix pt10 pb5']//li[@id='Hindi Delhi']"));
		
		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
		
	}
	
	private static void xpath_Self(WebDriver driver) {
		
		// tagname[@atrribute="value"]//self::currenttagname
		
		
		WebElement element_01 = driver.findElement(By.xpath("//li[@id='Bengali']//self::li"));
		WebElement element_02 = driver.findElement(By.xpath("(//li[@class='py-3 pl-4 text-sm text-white hover:bg-primary-500']//self::li)[2]"));
		WebElement element_03 = driver.findElement(By.xpath("//a[@title='Bihari Matrimony']//self::a"));
		WebElement element_04 = driver.findElement(By.xpath("//li[@id='Konkani']//self::li"));
		WebElement element_05 = driver.findElement(By.xpath("//li[@id='Hindi Delhi']//self::li"));
		
		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
		
	
	}
	

	private static void xpath_Child(WebDriver driver) {
		
		WebElement element_01 = driver.findElement(By.xpath("//li[@id='Bengali']//child::a"));
		WebElement element_02 = driver.findElement(By.xpath("(//ul//child::li)[67]"));
		WebElement element_03 = driver.findElement(By.xpath("//li[@id='Bihari']//child::a"));
		WebElement element_04 = driver.findElement(By.xpath("//li[@id='Konkani']//child::a"));
		WebElement element_05 = driver.findElement(By.xpath("//li[@id='Hindi Delhi']//child::a"));
		
		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
	}



	private static void xpath_Parent(WebDriver driver) 
	{
		WebElement element_01 = driver.findElement(By.xpath("//li[@id='Bengali']//parent::ul"));
		WebElement element_02 = driver.findElement(By.xpath("//ul//parent::div"));
		WebElement element_03 = driver.findElement(By.xpath("//a[@title='Bihari Matrimony']//parent::li"));
		WebElement element_04 = driver.findElement(By.xpath("//a[@title='Konkani Matrimony']//parent::li"));
		WebElement element_05 = driver.findElement(By.xpath("//a[@title='Hindi Delhi Matrimony']//parent::li"));
		
		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
		
	}


}
