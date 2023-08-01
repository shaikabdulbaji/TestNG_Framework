package a8AssertionInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class aAssertEqual {
	
	@Test(enabled = false)
	public void sampleMethodOne()
	{
		String str1 = "shaik";
		String str2 = "abdul";
		
		Assert.assertEquals(str1, str2);
		
	}

	@Test
	public void sampleMethodTwo()
	{
		String str1 = "shaik";
		String str2 = "shaik";
		
		Assert.assertEquals(str1, str2);
		
	}
}
