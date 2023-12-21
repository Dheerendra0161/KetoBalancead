package baseComponent;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utilsPackage.ExtntReport;

public class ProjectListner extends BaseCompo implements ITestListener{
	ExtentReports extent =  ExtntReport.extentReport();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
	 extent =  ExtntReport.extentReport();
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.INFO,result.getName()+" started executing");
				
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver = null;
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		String destinationScreenshotPath="";
		try {
			destinationScreenshotPath = BaseCompo.screenShot(driver,result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(destinationScreenshotPath);
		test.log(Status.INFO,result.getThrowable());
		test.log(Status.FAIL,result.getName()+" got failed ");	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.INFO,result.getThrowable());
		test.log(Status.SKIP, result.getName()+" got skipped");
	}


	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
		String pathOfExtentReport = System.getProperty("user.dir")+"extentreport1\\\\index.html";
		File extentReport = new File(pathOfExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
