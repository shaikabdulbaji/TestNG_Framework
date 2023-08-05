package b74TestNGRetry_using_IRetryAnalyzer_and_IAnnotationTransformer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyAnnotationTransformer implements IAnnotationTransformer{

	
	
	// To get this method go to source and click on override unimplemented methods
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		annotation.setRetryAnalyzer(MyRetryAnalyzer.class);	
	}

}
