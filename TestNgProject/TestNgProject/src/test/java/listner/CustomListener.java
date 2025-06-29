package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resuasability.Basic_Reuse;

public class CustomListener extends Basic_Reuse  implements ITestListener  {

	@Override
	//before all test start
	public void onStart(ITestContext context) {
		
		browserLaunch("Chrome");
		hitURL("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		//System.out.println("onStart..");
	}
	
	@Override
	//before one test start
	public void onTestStart(ITestResult result) {
		
		//action class
		try {
			takeScreenShot(result.getMethod().getMethodName());
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccesss..");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure..");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped..");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage..");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout..");
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish..");
		
	}

}
