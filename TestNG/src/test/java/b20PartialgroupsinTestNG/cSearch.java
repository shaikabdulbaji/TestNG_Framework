package b20PartialgroupsinTestNG;

import org.testng.annotations.Test;

public class cSearch {
	
	@Test(priority = 1,groups= {"smoke","sanity","search","all"})
	public void serachwithValidProduct()
	{
		System.out.println("serachwithValidProduct - Search");
	}
	
	@Test(priority = 2,groups= {"sanity","regression","search","all"})
	public void serachwithInvalidProduct()
	{
		System.out.println("serachwithInvalidProduct - Search");
	}
	
	@Test(priority = 3,groups= {"sanity","search","all"})
	public void serachwithEmptyProduct()
	{
		System.out.println("serachwithEmptyProduct - Search");
	}
	
	

}
