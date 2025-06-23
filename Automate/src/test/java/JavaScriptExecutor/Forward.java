package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import resuasability.Basic_Reuse;

public class Forward extends Basic_Reuse{

	
	public static void main(String[] args) throws Throwable {
		
		browserLaunch("Chrome");
		
		hitURL("https://www.selenium.dev/selenium/web/web-form.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		takeScreenShot("Perticularloction");
		
		//at Little down 
		js.executeScript("window.scrollBy(0,500)");
		takeScreenShot("lit_bottom");
		
		//scroll down to the bottom of a webpage.
		js.executeAsyncScript("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenShot("bottom");
		
		//refresh : window.history.go(0)
		js.executeScript("window.history.go(0)");
		takeScreenShot("refresh");
		
		//back
		js.executeScript("window.history.back()");
		
		takeScreenShot("back");
		
		//forward
		js.executeScript("window.history.forward()");
		takeScreenShot("forward");
		
		//to top
		js.executeScript("window.scrollTo(0,0)");
		takeScreenShot("toTop");
		 
	}
}
