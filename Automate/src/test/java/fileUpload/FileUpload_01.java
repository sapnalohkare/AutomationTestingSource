package fileUpload;
import org.openqa.selenium.By;
import resuasability.FileUploade_Resuse;

public class FileUpload_01 extends FileUploade_Resuse {

	public static void main(String[] args) throws Throwable {

		browserLaunch("Chrome");
		
		hitURL("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

		javaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)");
		
		fileUpload(By.xpath("//div[@class='input-group']"), "C:\\Users\\USER\\Documents\\Document.rtf");


	}

}
