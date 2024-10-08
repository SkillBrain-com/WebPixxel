package common.extentreport;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import common.pages.base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportListener extends BasePage implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		//Create an html report for the suite that is executed
		report = new ExtentReports("./report/" + suite.getName() + "_Results.html");
	}

	@Override
	public void onFinish(ISuite suite) {
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		logger = report.startTest(result.getMethod().getMethodName());
		logger.log(LogStatus.INFO, "Executing test: " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(LogStatus.INFO, "Finished executing test");
	}


	@Override
	public void onTestFailure(ITestResult result) {
		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)driver_local);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination
		String fileName = String.format("Screenshot-%s.png", Calendar.getInstance().getTimeInMillis());
		File DestFile=new File("./screenshots/" + fileName);

		//Copy file at destination

		try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
//		String fileName = String.format("Screenshot-%s.png", Calendar.getInstance().getTimeInMillis());
//		WebDriver driver = (WebDriver)result.getTestContext().getAttribute("WebDriver"); //use string from setAttribute from BasePage
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File destFile = new File("./screenshots/" + fileName);
//		try {
//			FileUtils.copyFile(srcFile, destFile);
//			System.out.println("Screenshot taken, saved in screenshots folder");
//		} catch(IOException e) {
//			System.out.println("Failed to take screenshot");
//		}
		logger.log(LogStatus.FAIL, "Test failed, attaching screenshot in screenshots folder");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.log(LogStatus.SKIP, "Test skipped");
	}

}