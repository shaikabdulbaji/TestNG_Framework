package b21Subcatgeorygroups_inTestNG_UsingRegularExpressions;

import org.testng.annotations.Test;

/*
 * Partialgroups in TestNG means grouping at class level.
 * for example we have "all" tag for every test case we want to put commanly that tag at class level
   that "all" tag will apply for all test cases in that class.
 */

public class bRegister {
	
	@Test(priority = 1,groups= {"windows.smoke","linux.sanity","ios.register"})
	public void registerwithMandatoryfields()
	{
		System.out.println("registerwithMandatoryfields - Register");
	}
	
	@Test(priority = 2,groups= {"windows.smoke","linux.sanity","ios.regression","windows.register"})
	public void registerwithAllfields()
	{
		System.out.println("registerwithAllfields - Register");
	}
	
	@Test(priority = 3,groups= {"windows.sanity","ios.register"})
	public void registerwithDuplicatefields()
	{
		System.out.println("registerwithDuplicatefields - Register");
	}
	
	@Test(priority = 4,groups= {"windows.register"})
	public void registerwithAnyfields()
	{
		System.out.println("registerwithAnyfields - Register");
	}
	
}
