package screenShort;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebForm {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		
		/*------------code for screenShort-----------*/
		
		//typecasting
       TakesScreenshot ts =  (TakesScreenshot) driver;
       
       //create source
       
       File source = ts.getScreenshotAs(OutputType.FILE);
       
       //create target path ="./foldername/ScreenShoName"
       
       File target = new File("./screenShot/hiturlSS1.png");
       
      FileHandler.copy(source, target);
	
 
      /*-----------2nd way----------------------*/
      
      //C:\Users\USER\eclipse-workspace\Automate\src\test\java\screenShort
      //C:\Users\USER\eclipse-workspace\Automate
      String projectPath = System.getProperty("user.dir");
      
      System.out.println("project path is : "+projectPath);
      
       
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12267997658086614075&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	
		   //typecasting
	       TakesScreenshot ts1 =  (TakesScreenshot) driver;
	       
	       //create source
	       
	       File source1 = ts1.getScreenshotAs(OutputType.FILE);
	       
	       //create target path ="./foldername/ScreenShoName"
	       
	     //  File target1 = new File("./screenShot/amazon.png");
	       //2nd way
	       File target1 = new File(projectPath+"\\screenShot\\ss1.png");
	       
	      FileHandler.copy(source1, target1);
	      

	}

}
