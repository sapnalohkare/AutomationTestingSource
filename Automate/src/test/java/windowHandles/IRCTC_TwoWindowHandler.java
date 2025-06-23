package windowHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.FluentWait;

public class IRCTC_TwoWindowHandler {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();

		Set<String> windows = driver.getWindowHandles();// parent, child, subchild
		Iterator<String> itr = windows.iterator();

		String parentId = itr.next();
		String childId = itr.next();

		System.out.println(windows.size());

		System.out.println(driver.switchTo().window(parentId).getTitle());

		driver.switchTo().window(childId);
		Thread.sleep(3000);
		System.out.println(driver.switchTo().window(childId).getTitle());

		WebElement heliYatra = driver
				.findElement(By.cssSelector("a[title='Tag'][href='https://heliyatra.irctc.co.in/']"));

		heliYatra.click();
		
		driver.switchTo().window(parentId);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[@class='allcircle circlefive']")).click();

		
		Set<String> Allwindows = driver.getWindowHandles(); //4
		System.out.println(Allwindows.size());
		
		Iterator< String> iterator = Allwindows.iterator();
		
		String winddow_IRCTC_01 =iterator.next();
		String winddow_Hotels_02 =iterator.next();
		String winddow_HeliYatra_03 =iterator.next();
		String winddow_TourPackage_04 =iterator.next();

		System.out.println("winddow_IRCTC_01 : "+driver.switchTo().window(winddow_IRCTC_01).getTitle());
		System.out.println("winddow_Hotels_02 : "+driver.switchTo().window(winddow_Hotels_02).getTitle());
		System.out.println("winddow_HeliYatra_03 : "+driver.switchTo().window(winddow_HeliYatra_03).getTitle());
		System.out.println("winddow_TourPackage_04 : "+driver.switchTo().window(winddow_TourPackage_04).getTitle());
		
		driver.quit();
	}


}
