package b33Multiple_DataProvidermethods_under_multipleclasses;

import org.testng.annotations.DataProvider;

public class bSampleProvider {

	@DataProvider(name="supplierOne")
	public String[][] dataSupplier1()
	{
		String[][] data = {{"Abdul","Baji","Mango"},
				{"Shaik","Rasool","Apple"},
				{"Kareem","Amma","banana"}};
		
		return data;	
	}
	
	// This session about "Multiple DataProvider methods"
	
	@DataProvider(name="supplierTwo")
	public String[][] dataSupplier2()
	{
		String[][] data = {{"Shaik","Baji","Red"},
				{"Abdul","Rasool","Black"},
				{"Kareem","Shaik","White"}};
		
		return data;	
	}
	
}
