package b35Different_returntypes_of_DataProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class cSetOvercomebyIteratorObject {
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object one)
	{
		System.out.println(one);
	}
	
	// While we are giving Set values then it will shows error to overcome this change "set.iterator".
	
	/*
	 	@DataProvider(name="supplierOne")
		public Set<Object> dataSupplier1()
		{
			Set<Object> set = new HashSet<>();
			set.add("Shaik");
			set.add(9);
			set.add(false);
			set.add(20.23d);
			
			return set;	
		}
		
		The above code gives error to over come this we use set.iterator method
	 */
	
	
	@DataProvider(name="supplierOne")
	public Iterator<Object> dataSupplier1()
	{
		Set<Object> set = new HashSet<>();
		set.add("Shaik");
		set.add(9);
		set.add(false);
		set.add(20.23d);
		
		return set.iterator();	
	}
	
	
}
