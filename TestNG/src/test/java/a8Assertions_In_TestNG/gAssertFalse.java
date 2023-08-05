package a8Assertions_In_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class gAssertFalse {

	@Test(enabled = false)
	public void sampleMethod() {
		
		String str = "My name is shaik abdul baji";

		Assert.assertFalse(str.contains("baji"));
	}
	
	@Test
	public void sampleMethodTwo() {
		
		String str = "My name is shaik abdul baji";

		Assert.assertFalse(str.contains("rasool"));
	}
}
