package a8Assertions_In_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class iAssertNullandAssertNotNull {

	
	// We don't use these both assertions in real time rearly we use 
	
	@Test(priority = 1)
	public void verifyAssertNull() {
		
		String str = null;

		Assert.assertNull(str);;
	}
	
	@Test(priority = 2)
	public void verifyAssertNotNull() {
		
		String str = "My name is shaik abdul baji";

		Assert.assertNotNull(str);;
	}
}
