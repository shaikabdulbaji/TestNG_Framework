package b54Morethreads_and_lessnumberoftests;

import org.testng.annotations.Test;

/*
 * Partialgroups in TestNG means grouping at class level.
 * for example we have "all" tag for every test case we want to put commanly that tag at class level
   that "all" tag will apply for all test cases in that class.
 */

@Test(groups = {"all"})
public class bRegister {
	
	@Test
	public void registerwithMandatoryfields()
	{
		System.out.println("registerwithMandatoryfields - Register -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void registerwithAllfields()
	{
		System.out.println("registerwithAllfields - Register -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void registerwithDuplicatefields()
	{
		System.out.println("registerwithDuplicatefields - Register -->"+Thread.currentThread().getId());
	}
	
	@Test
	public void registerwithAnyfields()
	{
		System.out.println("registerwithAnyfields - Register -->"+Thread.currentThread().getId());
	}
	
}
