package b35Different_returntypes_of_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class aTwoDimensionArray {
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object one, Object two, Object three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}
	
	/*
	 * While we are giving integer values then it will shows error to overcome this 
	   change String to integer.
	 */
	
	@DataProvider(name="supplierOne")
	public Object[][] dataSupplier1()
	{
		Object[][] data = {{"Abdul",8,false},
				{6,"shaik",20.22d},
				{"Rasool",2,20.6f}};
		
		return data;	
	}
	
	
}
