package Learn.Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeLaunch {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement searchElements = driver.findElement(By.name("Pke_EE") );
		searchElements.sendKeys("Mobile");
		
	//	WebElement searchBtn = driver.findElement(By.) 
		
		
	}

}
