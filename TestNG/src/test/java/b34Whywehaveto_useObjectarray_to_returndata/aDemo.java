package b34Whywehaveto_useObjectarray_to_returndata;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class aDemo {
	
	/*
	@Test(dataProvider = "supplierOne")
	public void sample(String one, String two, String three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}
	
	@DataProvider(name="supplierOne")
	public String[][] dataSupplier1()
	{
		String[][] data = {{"Abdul","Baji","Mango"},
				{"Shaik","Rasool","Apple"},
				{"Kareem","Amma","banana"}};
		
		return data;	
	}
	*/
	
	/*
	@Test(dataProvider = "supplierOne")
	public void sample(Integer one, Integer two, Integer three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}
	
	// While we are giving integer values then it will shows error to overcome this change String to integer
	@DataProvider(name="supplierOne")
	public Integer[][] dataSupplier1()
	{
		Integer[][] data = {{9,8,7},
				{6,5,4},
				{3,2,1}};
		
		return data;	
	}
	*/
	
	/*
	 * While in future we are giving double and float values then it will shows errors 
	   to overcome this change to "Object".
	 * These all are Wrapper Classes.
	 */
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object one, Object two, Object three)
	{
		System.out.println(one+" _ "+two+" _ "+three);
	}
	
	// While we are giving integer values then it will shows error to overcome this change String to integer
	@DataProvider(name="supplierOne")
	public Object[][] dataSupplier1()
	{
		Object[][] data = {{"Abdul",8,false},
				{6,"shaik",20.22d},
				{"Rasool",2,20.6f}};
		
		return data;	
	}
	
	
}
