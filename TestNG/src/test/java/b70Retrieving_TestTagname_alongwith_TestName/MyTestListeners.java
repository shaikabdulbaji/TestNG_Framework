package b70Retrieving_TestTagname_alongwith_TestName;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import b70uBase.Base;

/*
 * result.getTestContext().getName() --> will give test tagname that is from testng.xml file
 * result.getTestName() --> Will give test name
 */

public class MyTestListeners extends Base implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getTestContext().getName()+"_"+result.getTestName();
		System.out.println(testName+" Started ");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String testName = result.getTestContext().getName()+"_"+result.getTestName();
		System.out.println(testName+" Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String testName = result.getTestContext().getName()+"_"+result.getTestName();
		System.out.println(testName+" Failed ");
		
		WebDriver driver = null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		takeScreenShot(driver, testName);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		String testName = result.getTestContext().getName()+"_"+result.getTestName();
		System.out.println(testName+" Skipped ");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		String testName = result.getTestContext().getName()+"_"+result.getTestName();
		System.out.println(testName+" Failed With Timeout ");
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println(" Test Execution Started ");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		System.out.println(" Test Execution is Completed ");
		
	}
	
	

}
