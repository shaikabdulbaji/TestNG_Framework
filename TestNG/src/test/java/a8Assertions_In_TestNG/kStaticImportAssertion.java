package a8Assertions_In_TestNG;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class kStaticImportAssertion {
	
	// Without static we import this statement "import org.testng.Assert;"
	@Test
	public void sampleMethodOne()
	{
		String str1 = "abdul";
		String str2 = "baji";
		
		Assert.assertNotEquals(str1, str2, "str1 is not equal to str2, Hence failed");
		
		Assert.assertTrue(str1.contains("abdul"));
	}
	
		// With static we import this statement "import org.testng.Assert;"
		//import static org.testng.Assert.assertNotEquals;
		//import static org.testng.Assert.assertTrue;
		// In above two lines in replace assertNotEquals and assertTrue with "*", it works for all Asserts
		@Test
		public void sampleMethodTwo()
		{
			String str1 = "abdul";
			String str2 = "baji";
			
			assertNotEquals(str1, str2);
			
			assertTrue(str1.contains("abdul"));
		}

}
