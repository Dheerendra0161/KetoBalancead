package utilsPackage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtntReport {
	ExtentTest test;
	static ExtentSparkReporter reporter;
	static ExtentReports extent;
	
	public static ExtentReports extentReport() {
		String path=System.getProperty("usir.dir")+"\\extentreport1\\index.html";
	    reporter=new ExtentSparkReporter(path);
	    reporter.config().setTheme(Theme.DARK);
	    reporter.config().setReportName("ketobalanced Test Automation Results Report");
	    reporter.config().setDocumentTitle("TN Automation Report");
	    reporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		reporter.config().setReportName("Test Result");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Automation Test", "Vivek Pandey");
		return extent;
	}

}
