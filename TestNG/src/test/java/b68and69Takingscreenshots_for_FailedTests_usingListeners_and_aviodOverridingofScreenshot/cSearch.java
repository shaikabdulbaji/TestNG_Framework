package b68and69Takingscreenshots_for_FailedTests_usingListeners_and_aviodOverridingofScreenshot;

import org.testng.annotations.Test;

public class cSearch {
	
	@Test
	public void serachwithValidProduct()
	{
		System.out.println("serachwithValidProduct - Search -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void serachwithInvalidProduct()
	{
		System.out.println("serachwithInvalidProduct - Search -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void serachwithEmptyProduct()
	{
		System.out.println("serachwithEmptyProduct - Search -->"+Thread.currentThread().getId());
	}
	
	

}
