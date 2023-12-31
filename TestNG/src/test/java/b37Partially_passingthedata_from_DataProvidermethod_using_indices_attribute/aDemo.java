package b37Partially_passingthedata_from_DataProvidermethod_using_indices_attribute;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * Before indices all one to ten data was taken and it will execute.
 * After using indices, the index positions which we are giving that positions 
   only it will excute.
 * The indices are mainly used when large amount of data is there we want to 
   test it with giving some index positions.
 */

public class aDemo {
	
	@Test(dataProvider = "supplier")
	public void sample(String a)
	{
		
		System.out.println(a);
		
	}
	
	@DataProvider(name="supplier", indices = {0,4,7})
	public Object[] dataSupplier()
	{
		Object[] data = {"one","two","three", "four","five","six","seven","eight","nine","ten"};
		
		return data;	
	}

}
