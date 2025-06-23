package GrowAI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.selenium.dev");
		driver.findElement(By.linkText("Documentation")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		String  title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		
		

	}

}
