package b32MultipleDataProvider_methods;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * In this session we will learn how to create multiple data provider methods in data 
   provide class and supply to main method like this.
   
   @Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
	//@Test(dataProvider = "supplierTwo", dataProviderClass = bSampleProvider.class)
	
 * If we can to run tests under bSampleProvider->class supplerOne->method then use this
   in main test
   @Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
   supplerOne->method
   bSampleProvide->class 
   
 * If we can to run tests under bSampleProvider->class supplerTwo->method then use this
   in main test
   @Test(dataProvider = "supplierTwo", dataProviderClass = bSampleProvider.class)
   supplerTwo->method
   bSampleProvide->class  
 */


public class aDemo {
	
	@Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
	//@Test(dataProvider = "supplierTwo", dataProviderClass = bSampleProvider.class)
	public void sample(String one, String two, String three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}

	
}
