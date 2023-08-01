package b25and26DependsOnGroupsattributeandGroupsdependsonGroups;

import org.testng.annotations.Test;

/*
 * Any test from dependent group fails, rest of the test cass are skipped
 */


public class aLogin {
	
	@Test(groups= {"smoke"})
	public void loginwithvalididandvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login - smoke");
	}
	
	@Test(groups= {"sanity"})
	public void loginwithInvalididandvalidpassword()
	{
		System.out.println("loginwithInvalididandvalidpassword - Login - sanity");
	}
	
	@Test(groups= {"sanity"})
	public void loginwithvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandInvalidpassword - Login - sanity");
	}
	
	@Test(groups= {"smoke"})
	public void loginwithInvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login - smoke");
	}
	
//	@Test(dependsOnGroups= {"regression"})
//	public void aloginwithNoidandNopassword()
//	{
//		System.out.println("aloginwithNoidandNopassword - Login");
//	}
	
	@Test(groups= {"regression"})
	public void aloginwithNoidandNopassword()
	{
		System.out.println("aloginwithNoidandNopassword - Login");
	}

}
