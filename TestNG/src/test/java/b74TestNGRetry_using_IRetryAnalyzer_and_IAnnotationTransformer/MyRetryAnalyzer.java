package b74TestNGRetry_using_IRetryAnalyzer_and_IAnnotationTransformer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{
		
	int counter = 0;
	int retryLimit = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<retryLimit)
		{
			
			counter ++;
			return true;
		}
		
		return false;
	}

}
