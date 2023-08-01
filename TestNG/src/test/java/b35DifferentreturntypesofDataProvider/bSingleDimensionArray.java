package b35DifferentreturntypesofDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class bSingleDimensionArray {
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object one)
	{
		System.out.println(one);
	}
	
	@DataProvider(name="supplierOne")
	public Object[] dataSupplier1()
	{
		Object[] data = {"Abdul",9,false,"Raja"};
		
		return data;	
	}
	
	
}
