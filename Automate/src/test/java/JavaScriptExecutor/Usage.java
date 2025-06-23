package JavaScriptExecutor;
import resuasability.Basic_Reuse;

public class Usage extends Basic_Reuse {

	//scroll, refresh back, forward,top,bottom
	
	public static void main(String[] args) throws Throwable {
		
		browserLaunch("Chrome");
		
		hitURL("https://www.selenium.dev/selenium/web/web-form.html");
		
		//at Little down 
		/*js.executeScript("window.scrollBy(0,500)");
		takeScreenShot("Perticularloction");*/
		
		//javaScriptExecutor("window.scrollBy(0,500)", "");--works
		javaScriptExecutor("window.scrollBy(0,500)");
		//javaScriptExecutor("\"window.scrollBy(0,500)\", \"\"");
		takeScreenShot("Perticularloction");

		
		
		//scroll down to the bottom of a webpage.
		javaScriptExecutor("window.scrollBy(0,document.body.scrollHeight)");
		takeScreenShot("bottom");
		
		//refresh : window.history.go(0)
		javaScriptExecutor("window.history.go(0)");
		takeScreenShot("refresh");
		
		//back
		javaScriptExecutor("window.history.back()");
		
		takeScreenShot("back");
		
		//forward
		javaScriptExecutor("window.history.forward()");
		takeScreenShot("forward");
		
		//to top
		javaScriptExecutor("window.scrollTo(0,0)");
		takeScreenShot("toTop");
		
		
	}
}
			
			
			 


