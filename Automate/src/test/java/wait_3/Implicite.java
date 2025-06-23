package wait_3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*Selenium has a built-in way to automatically wait for elements called an implicit wait. An implicit wait 
 * value can be set either with the timeouts capability in the browser options, or with a driver method (as shown below).

This is a global setting that applies to every element location call for the entire session. 
The default value is 0, which means that if the element is not found, it will immediately return an error.
 If an implicit wait is set, the driver will wait for the duration of the provided value before returning the error. 
 Note that as soon as the element is located, the driver will re
turn the element reference and the code will continue executing, so a larger implicit wait value won’t necessarily 
increase the duration of the session.
 * */
public class Implicite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Applicable for all Webelement : i.e 7 sec
		//advantage : with implicite wait : if element loads in 5 sec then rest 2 sec will automatically use to load next script of element 
		

	}

}
