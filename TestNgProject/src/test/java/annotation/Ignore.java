package annotation;
import org.testng.annotations.Test;


public class Ignore {
	
	@Test(priority =1) @org.testng.annotations.Ignore
	public void launchBrowser() {

		System.out.println("ignore this test method...");
	}

	@Test(priority = 2)
	public void HitURL() {

		System.out.println("hitURL Method..");
	}
}
