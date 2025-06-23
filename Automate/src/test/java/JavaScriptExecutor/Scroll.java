package JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;

import resuasability.Basic_Reuse;
public class Scroll  extends Basic_Reuse {

	public static void main(String[] args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

	}

}
