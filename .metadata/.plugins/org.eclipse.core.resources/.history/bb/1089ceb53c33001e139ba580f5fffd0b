package b35DifferentreturntypesofDataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cListOvercomebyIteratorObject {
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object one)
	{
		System.out.println(one);
	}
	
	// While we are giving List values then it will shows error to overcome this change "list.iterator".
	/*
	 	@DataProvider(name="supplierOne")
		public List<Object> dataSupplier1()
		{
			List<Object> list = new ArrayList<>();
			list.add("Shaik");
			list.add(9);
			list.add(false);
			list.add(20.23d);
			
			return list;
			
			The above code gives error to over come this we use list.iterator method.
		}
	 */
	
	@DataProvider(name="supplierOne")
	public Iterator<Object> dataSupplier1()
	{
		List<Object> list = new ArrayList<>();
		list.add("Shaik");
		list.add(9);
		list.add(false);
		list.add(20.23d);
		
		return list.iterator();	
	}
	
	
}
