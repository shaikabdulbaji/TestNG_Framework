package b32MultipleDataProvidermethods;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class aDemo {
	
	//@Test(dataProvider = "supplierOne", dataProviderClass = bSampleProvider.class)
	@Test(dataProvider = "supplierTwo", dataProviderClass = bSampleProvider.class)
	public void sample(String one, String two, String three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}

	
}
