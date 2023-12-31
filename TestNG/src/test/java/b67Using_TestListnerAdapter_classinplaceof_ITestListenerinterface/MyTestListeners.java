package b67Using_TestListnerAdapter_classinplaceof_ITestListenerinterface;

import java.util.Collection;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/*
 * "TestListenerAdapter" contains lot of methods than "ITestListener"
 * "TestListenerAdapter" is a part of "ITestListener"
  
 * again go to source and click on unimplemented methods it wills how all click select 
   all ok.
 */

//public class MyTestListeners implements ITestListener{

public class MyTestListeners extends TestListenerAdapter {

	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSkipped(tr);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailedWithTimeout(tr);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailedButWithinSuccessPercentage(tr);
	}

	@Override
	protected ITestNGMethod[] getAllTestMethods() {
		// TODO Auto-generated method stub
		return super.getAllTestMethods();
	}

	@Override
	public void onStart(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onStart(testContext);
	}

	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		super.onFinish(testContext);
	}

	@Override
	public List<ITestResult> getFailedButWithinSuccessPercentageTests() {
		// TODO Auto-generated method stub
		return super.getFailedButWithinSuccessPercentageTests();
	}

	@Override
	public List<ITestResult> getFailedTests() {
		// TODO Auto-generated method stub
		return super.getFailedTests();
	}

	@Override
	public List<ITestResult> getPassedTests() {
		// TODO Auto-generated method stub
		return super.getPassedTests();
	}

	@Override
	public List<ITestResult> getSkippedTests() {
		// TODO Auto-generated method stub
		return super.getSkippedTests();
	}

	@Override
	public Collection<ITestResult> getTimedoutTests() {
		// TODO Auto-generated method stub
		return super.getTimedoutTests();
	}

	@Override
	public void setAllTestMethods(List<ITestNGMethod> allTestMethods) {
		// TODO Auto-generated method stub
		super.setAllTestMethods(allTestMethods);
	}

	@Override
	public void setFailedButWithinSuccessPercentageTests(List<ITestResult> failedButWithinSuccessPercentageTests) {
		// TODO Auto-generated method stub
		super.setFailedButWithinSuccessPercentageTests(failedButWithinSuccessPercentageTests);
	}

	@Override
	public void setFailedTests(List<ITestResult> failedTests) {
		// TODO Auto-generated method stub
		super.setFailedTests(failedTests);
	}

	@Override
	public void setPassedTests(List<ITestResult> passedTests) {
		// TODO Auto-generated method stub
		super.setPassedTests(passedTests);
	}

	@Override
	public void setSkippedTests(List<ITestResult> skippedTests) {
		// TODO Auto-generated method stub
		super.setSkippedTests(skippedTests);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		super.onTestStart(result);
	}

	@Override
	public List<ITestContext> getTestContexts() {
		// TODO Auto-generated method stub
		return super.getTestContexts();
	}

	@Override
	public List<ITestResult> getConfigurationFailures() {
		// TODO Auto-generated method stub
		return super.getConfigurationFailures();
	}

	@Override
	public void onConfigurationFailure(ITestResult itr) {
		// TODO Auto-generated method stub
		super.onConfigurationFailure(itr);
	}

	@Override
	public List<ITestResult> getConfigurationSkips() {
		// TODO Auto-generated method stub
		return super.getConfigurationSkips();
	}

	@Override
	public void beforeConfiguration(ITestResult tr) {
		// TODO Auto-generated method stub
		super.beforeConfiguration(tr);
	}

	@Override
	public void onConfigurationSkip(ITestResult itr) {
		// TODO Auto-generated method stub
		super.onConfigurationSkip(itr);
	}

	@Override
	public void onConfigurationSuccess(ITestResult itr) {
		// TODO Auto-generated method stub
		super.onConfigurationSuccess(itr);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	

}
