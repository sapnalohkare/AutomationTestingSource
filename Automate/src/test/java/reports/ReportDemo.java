package reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import resuasability.Reports_Resuse;

public class ReportDemo extends Reports_Resuse{

	public static void main(String[] args) throws Throwable {
		reports("DynamicReports", "Testing Demo", "https://www.flipkart.com/", "Flipkart");
		
		tsetCases("Hit URL", "testPass","HITURL");
		tsetCases("search", "search functionality","Search");
		tsetCases("Data send ", "text entered","DataSend");
		tsetCases("clicked", "click on search","Clicked");
		
		browserLaunch("Chrome");
		takeScreenShot("ChromeSS1");
		hitURL("https://www.flipkart.com/");
		takeScreenShot("HITURLSS1");
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("mobile");
		
		screenShot("ImpReport");
		Er.flush();

	}

}
