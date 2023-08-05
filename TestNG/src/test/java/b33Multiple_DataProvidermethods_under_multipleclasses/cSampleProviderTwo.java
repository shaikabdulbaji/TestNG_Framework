package b33Multiple_DataProvidermethods_under_multipleclasses;

import org.testng.annotations.DataProvider;

public class cSampleProviderTwo {

	@DataProvider(name="supplierThree")
	public String[][] dataSupplier3()
	{
		String[][] data = {{"Kondamudi","Raja","Table"},
				{"Kondamudi","Rani","Pen"},
				{"Kondamudi","Bhatudu","Pencil"}};
		
		return data;	
	}
		
	@DataProvider(name="supplierFour")
	public String[][] dataSupplier4()
	{
		String[][] data = {{"Hussain","Baji","Strong"},
				{"Abdul","Shaik","Week"}};
		
		return data;	
	}
	
}
