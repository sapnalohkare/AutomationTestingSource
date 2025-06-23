package actionClass.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;

public class release extends Basic_Reuse {

	public static void main(String[] args) throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1050)", "");
		
		
		WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
		
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		Actions action = new Actions(driver);
	
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		takeScreenShot("release");
		
		
		//to default value
		driver.switchTo().defaultContent();
	
		WebElement sortable = driver.findElement(By.xpath("//a[text()='Sortable']"));
		
		action.moveToElement(sortable).click().build().perform();
		
		driver.quit();
	}

}
