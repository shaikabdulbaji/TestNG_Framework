package b35Different_returntypes_of_DataProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dIteratorObject {
	
	@Test(dataProvider = "supplierOne")
	public void sample(Object one, Object two)
	{
		System.out.println(one+" - "+two);
	}
	
	@DataProvider(name="supplierOne")
	public Iterator<Object[]> dataSupplier1()
	{
		List<Object[]> list = new ArrayList<>();
		list.add(new Object[] {"shaik", "abdul"});
		list.add(new Object[] {"abdul", "rasool"});
		list.add(new Object[] {"shaik", "kareem"});
		list.add(new Object[] {"hussain", "abdul"});
		
		return list.iterator();	
	}
	
	
}
