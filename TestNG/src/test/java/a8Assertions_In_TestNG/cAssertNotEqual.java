package a8Assertions_In_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class cAssertNotEqual {
	
	@Test
	public void sampleMethodOne()
	{
		String str1 = "shaik";
		String str2 = "abdul";
		
		Assert.assertNotEquals(str1, str2);
		
	}

	@Test(enabled = false)
	public void sampleMethodTwo()
	{
		String str1 = "shaik";
		String str2 = "shaik";
		
		Assert.assertNotEquals(str1, str2);
		
	}
}
