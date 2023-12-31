package b20Partialgroups_inTestNG;

import org.testng.annotations.Test;

/*
 * Partialgroups in TestNG means grouping at class level.
 * for example we have "all" tag for every test case we want to put commanly that tag at class level
   that "all" tag will apply for all test cases in that class.
 */

@Test(groups = {"all"})
public class bRegister {
	
	@Test(priority = 1,groups= {"smoke","sanity","register"})
	public void registerwithMandatoryfields()
	{
		System.out.println("registerwithMandatoryfields - Register");
	}
	
	@Test(priority = 2,groups= {"smoke","sanity","regression","register"})
	public void registerwithAllfields()
	{
		System.out.println("registerwithAllfields - Register");
	}
	
	@Test(priority = 3,groups= {"sanity","register"})
	public void registerwithDuplicatefields()
	{
		System.out.println("registerwithDuplicatefields - Register");
	}
	
	@Test(priority = 4,groups= {"register"})
	public void registerwithAnyfields()
	{
		System.out.println("registerwithAnyfields - Register");
	}
	
}
