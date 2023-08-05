package b55parallelclasses_or_parallelmethods_specified_at_suitetaglevel;

import org.testng.annotations.Test;

public class cSearch2 {
	
	@Test
	public void serachwithValidProduct()
	{
		System.out.println("serachwithValidProduct - Search2 -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void serachwithInvalidProduct()
	{
		System.out.println("serachwithInvalidProduct - Search2 -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void serachwithEmptyProduct()
	{
		System.out.println("serachwithEmptyProduct - Search2 -->"+Thread.currentThread().getId());
	}
	
	

}
