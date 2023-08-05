package b65onStart_and_onFinish_ITestListenermethods;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getName();
		System.out.println(testName+" Started ");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		String testName = result.getName();
		System.out.println(testName+" Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String testName = result.getName();
		System.out.println(testName+" Failed ");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		String testName = result.getName();
		System.out.println(testName+" Skipped ");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

		String testName = result.getName();
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
