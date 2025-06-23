package Css_PseudoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoClass {

	// 1) //select[class='form-select'] :first-child
	// 2) //select[class='form-select'] :last-child
	// 3) //select[class='form-select'] :nth-child(n)
	// 4) //select[class='form-select'] :nth-last-child(n)

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.jeevansathi.com/m0/search/AdvancedSearch#");

			
			System.out.println(driver.getPageSource());
			
	
			Css_PseudoClass_First_Child(driver);
			
			Css_PseudoClass_Last_Child(driver);
			  
			Css_PseudoClass_nth_Child(driver);
			  
			Css_PseudoClass_nth_Last_Child(driver);
		
			driver.close();
		 
	}

	private static void Css_PseudoClass_First_Child(WebDriver driver) {

		// select[class='form-select'] :first-child

	

		WebElement element_01 = driver.findElement(By.cssSelector("ul[class='menushadowGNB'] :first-child")); // Search
		WebElement element_02 = driver.findElement(By.cssSelector("ul[class='hor_list clearfix'] :first-child"));// Bride
		WebElement element_03 = driver.findElement(By.cssSelector("ul[class='clearfix list-minage'] :first-child"));// 18
		WebElement element_04 = driver.findElement(By.cssSelector("ul[class='clearfix list-maxage'] :first-child"));// 18
		WebElement element_05 = driver.findElement(By.cssSelector("ul[class='chosen-results clearfix'] :first-child"));// Hindu

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);

	}
	private static void Css_PseudoClass_Last_Child(WebDriver driver) 
	{
		// select[class='form-select'] :last-child

		WebElement element_01 = driver.findElement(By.cssSelector("ul[class='menushadowGNB'] :last-child")); // Search
		WebElement element_02 = driver.findElement(By.cssSelector("ul[class='hor_list clearfix'] :last-child"));// Bride
		WebElement element_03 = driver.findElement(By.cssSelector("ul[class='clearfix list-minage'] :last-child"));// 70
		WebElement element_04 = driver.findElement(By.cssSelector("ul[class='clearfix list-maxage'] :last-child"));// 70
		WebElement element_05 = driver.findElement(By.cssSelector("ul[class='clearfix list-minlincome_dol'] :last-child"));// $200,001

		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
	}
	
	

	private static void Css_PseudoClass_nth_Child(WebDriver driver)
	{
		//select[class='form-select'] :nth-child(n)
		
		WebElement element_01 = driver.findElement(By.cssSelector("ul[class='menushadowGNB'] :nth-child(2)")); // Search by profile ID
		WebElement element_02 = driver.findElement(By.cssSelector("ul[class='hor_list clearfix'] :nth-child(2)"));// Bride
		WebElement element_03 = driver.findElement(By.cssSelector("ul[class='clearfix list-minage'] :nth-child(5)"));// 22
		WebElement element_04 = driver.findElement(By.cssSelector("ul[class='clearfix list-maxage'] :nth-child(10)"));// 27
		WebElement element_05 = driver.findElement(By.cssSelector("ul[class='clearfix list-minlincome_dol'] :nth-child(4)"));//$60,001
		
		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
	}
	
	
	private static void Css_PseudoClass_nth_Last_Child(WebDriver driver)
   {

		//select[class='form-select'] :nth-last-child(n)
		
		WebElement element_01 = driver.findElement(By.cssSelector("ul[class='menushadowGNB'] :nth-last-child(2)")); // Search
		WebElement element_02 = driver.findElement(By.cssSelector("ul[class='hor_list clearfix'] :nth-last-child(2)"));// Bride
		WebElement element_03 = driver.findElement(By.cssSelector("ul[class='clearfix list-minage'] :nth-last-child(7)"));// 64
		WebElement element_04 = driver.findElement(By.cssSelector("ul[class='clearfix list-maxage'] :nth-last-child(10)"));// 61
		WebElement element_05 = driver.findElement(By.cssSelector("ul[class='clearfix list-minlincome_dol'] :nth-last-child(4)"));//$80,001
		
		System.out.println(element_01 + " " + element_02 + " " + element_03 + " " + element_04 + " " + element_05);
   }

	

	

}
