package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import resuasability.Basic_Reuse;

public class Refresh extends Basic_Reuse {

	public static void main(String[] args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//refresh : window.history.go(0)
		js.executeScript("window.history.go(0)");
	}
}
