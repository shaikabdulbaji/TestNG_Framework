package b21Subcatgeorygroups_inTestNG_UsingRegularExpressions;

import org.testng.annotations.Test;

public class cSearch {
	
	@Test(priority = 1,groups= {"windows.smoke","linux.sanity","ios.search","windows.all"})
	public void serachwithValidProduct()
	{
		System.out.println("serachwithValidProduct - Search");
	}
	
	@Test(priority = 2,groups= {"windows.sanity","linux.regression","ios.search","windows.all"})
	public void serachwithInvalidProduct()
	{
		System.out.println("serachwithInvalidProduct - Search");
	}
	
	@Test(priority = 3,groups= {"windows.sanity","linux.search","ios.all"})
	public void serachwithEmptyProduct()
	{
		System.out.println("serachwithEmptyProduct - Search");
	}
	
	

}
