package GrowAI;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	// stale - no longer valid or outdated
	/*
	 * solution :1) re-find element 
	 * 2)Explicite wait 
	 * 3)try catch block with retry logic
	 *   
	 *   public  
	 *    int attempts = 0;
	 *    while(attempts<2)
	 *    {
	 *      try{
	 *      
	 *      
	 *      }catch()
	 *      {
	 *      
	 *      }
	 *    }
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");

	}

}
