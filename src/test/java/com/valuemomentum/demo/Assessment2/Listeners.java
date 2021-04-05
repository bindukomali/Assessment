package com.valuemomentum.demo.Assessment2;

//import java.io.File;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners implements ITestListener {

	protected static ExtentReports reports;
	protected static ExtentTest test;
	protected ExtentSparkReporter spark;

	@Override
	public void onTestStart(ITestResult result) {

		test = reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName() + "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		// test screenshot code here
		WebDriverHelper.captureScreenshot(result.getMethod().getMethodName().trim());
		test.log(Status.FAIL, "Test Failed");

		test.addScreenCaptureFromPath(
				"C:\\training\\java\\automationtest\\ScreenShot1\\" + result.getMethod().getMethodName() + ".png");

		test.log(Status.FAIL,
				"C:\\training\\java\\automationtest\\ScreenShot1\\"+result.getMethod().getMethodName()+".png");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

		reports = new ExtentReports();
		spark = new ExtentSparkReporter(
				"target/" + new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-ms").format(new Date()) + "reports.html");
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.attachReporter(spark);
		reports.flush();
	}

}