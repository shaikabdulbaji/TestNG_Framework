package b19Metagroups_inTestNG;

import org.testng.annotations.Test;

public class aLogin {
	
	@Test(priority = 1,groups= {"smoke","sanity","login","all"})
	public void loginwithvalididandvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login");
	}
	
	@Test(priority = 2,groups= {"sanity","login","all"})
	public void loginwithInvalididandvalidpassword()
	{
		System.out.println("loginwithInvalididandvalidpassword - Login");
	}
	
	@Test(priority = 3,groups= {"sanity","regression","login","all"})
	public void loginwithvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandInvalidpassword - Login");
	}
	
	@Test(priority = 4,groups= {"smoke","sanity","login","all"})
	public void loginwithInvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login");
	}
	
	@Test(priority = 5,groups= {"sanity","regression","login","all"})
	public void loginwithNoidandNopassword()
	{
		System.out.println("loginwithNoidandNopassword - Login");
	}

}
