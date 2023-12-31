package b33Multiple_DataProvidermethods_under_multipleclasses;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

/*
* In this session we will learn how to create multiple data provider methods in 
  multiple data provider classes and supply to main method like this.
  
  //@Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
	@Test(dataProvider = "supplierThree", dataProviderClass = cSampleProviderTwo.class)
	
* If we can to run tests under bSampleProvider->class supplerOne->method then use this
   in main test
   @Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
   supplerOne->method
   bSampleProvide->class 
   
 * If we can to run tests under bSampleProvider->class supplerTwo->method then use this
   in main test
   @Test(dataProvider = "supplierTwo", dataProviderClass = cSampleProvider.class)
   supplerThree->method
   cSampleProvide->class  
*/



public class aDemo {
	
	//@Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
	@Test(dataProvider = "supplierThree", dataProviderClass = cSampleProviderTwo.class)
	public void sample(String one, String two, String three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}

	
}
