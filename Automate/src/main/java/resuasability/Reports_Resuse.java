package resuasability;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports_Resuse extends Basic_Reuse{
	public static String projectPath = System.getProperty("user.dir");
	public static ExtentReports Er;
	public static ExtentTest Et;
	
	public static void reports(String DocTitle,String ReportName,String App,String ClientName) {

		ExtentSparkReporter Esr = new ExtentSparkReporter(projectPath + "\\Reports\\GerateReport\\");

		// configuration set
		Esr.config().setDocumentTitle(DocTitle);
		Esr.config().setReportName(ReportName);
		Esr.config().setTheme(Theme.STANDARD);// Theme.DARK --> black color

		// system configuration set
		Er= new ExtentReports();
		Er.attachReporter(Esr);

		Er.setSystemInfo("OS", "Windows");
		Er.setSystemInfo("Browser", "Chrome");
		Er.setSystemInfo("Domain", "Ecommerce");
		Er.setSystemInfo("Application", App);
		Er.setSystemInfo("Client", ClientName);
		Er.setSystemInfo("QA", "Sapna Lohkare");
		Er.setSystemInfo("Devloper", "Granthik Lohkare");
	}
	
	public static void tsetCases(String testName,String testInfo,String screenShotName)
	{
		Et = Er.createTest(testName);
		Et.log(Status.INFO,testInfo);
		
		Et.addScreenCaptureFromPath(projectPath+"\\ReportSS1\\"+screenShotName+".png");
		//Et.log(Status.PASS, "Test Pass");
	}
	
	
	

}
