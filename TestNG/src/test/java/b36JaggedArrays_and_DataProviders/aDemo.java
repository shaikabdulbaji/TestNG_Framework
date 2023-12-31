package b36JaggedArrays_and_DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * normal array are :
   Object[][] data = {{"Abdul",8,false},
				{6,"shaik",20.22d},
				{"Rasool",2,20.6f}};
 * normal arrays have equal no.of parameters.

 * Jagged arrays are :
   Object[][] data = {{"one","two","three"},
				{"four","five"},
				{"six","seven","eight","nine","ten"}};
 * Jogged arrays have noo equal no.of parameters.
 */

public class aDemo {
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("------------------");
	}
	

	@DataProvider(name="supplierOne")
	public Object[][] dataSupplier1()
	{
		Object[][] data = {{"one","two","three"},
				{"four","five"},
				{"six","seven","eight","nine","ten"}};
		
		return data;	
	}

}
