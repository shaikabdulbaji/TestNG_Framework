package b17GroupingTests_in_TestNG;

import org.testng.annotations.Test;

public class cSearch {
	
	@Test(priority = 1)
	public void serachwithValidProduct()
	{
		System.out.println("serachwithValidProduct - Search");
	}
	
	@Test(priority = 2)
	public void serachwithInvalidProduct()
	{
		System.out.println("serachwithInvalidProduct - Search");
	}
	
	@Test(priority = 3)
	public void serachwithEmptyProduct()
	{
		System.out.println("serachwithEmptyProduct - Search");
	}
	
	

}
