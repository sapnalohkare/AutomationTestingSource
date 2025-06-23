package dropDown.Dynamic;

import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;

import resuasability.Basic_Reuse;

public class Railyatri_DynamicDropDown extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {
		browserLaunch("Chrome");
		
		hitURL("https://www.railyatri.in/");
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");*/
		javaScriptExecutor("window.scrollBy(0,300)");
		
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		from.click();
		from.sendKeys("Pu");
		
		Thread.sleep(3000);
	
		List<WebElement> seachedOptions = driver.findElements(By.xpath("//ul[@id='ui-id-5']//child::li"));
		
		System.out.println(seachedOptions.size());
		
		for (int i = 0; i < seachedOptions.size(); i++) 
		{
			//System.out.println(seachedOptions.get(i).getText());
			
			if (seachedOptions.get(i).getText().equalsIgnoreCase("PUNE JN | PUNE")) 
			{
				seachedOptions.get(i).click();
				break;
			}
		}
		driver.quit();
	}


}
