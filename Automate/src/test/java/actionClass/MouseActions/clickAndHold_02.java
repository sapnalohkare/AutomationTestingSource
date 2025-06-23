package actionClass.MouseActions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import resuasability.Basic_Reuse;
public class clickAndHold_02 extends Basic_Reuse{

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
		
		//1 ways
		action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		takeScreenShot("clickAndHold_02");
		
		//2nd way
		
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		takeScreenShot("clickAndHold_03");
		
		//3rd way
		action.dragAndDrop(drag, drop).build().perform();
		takeScreenShot("clickAndHold_04");
		
		//to default value
		driver.switchTo().defaultContent();
	
		WebElement sortable = driver.findElement(By.xpath("//a[text()='Sortable']"));
		
		action.moveToElement(sortable).click().build().perform();
		
		driver.quit();
		
	}

}
