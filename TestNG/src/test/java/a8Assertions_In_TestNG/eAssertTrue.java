package a8Assertions_In_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class eAssertTrue {

	@Test
	public void sampleMethod() {
		
		String str = "My name is shaik abdul baji";

		Assert.assertTrue(str.contains("baji"));
	}
	
	@Test(enabled = false)
	public void sampleMethodTwo() {
		
		String str = "My name is shaik abdul baji";

		Assert.assertTrue(str.contains("rasool"));
	}
}
