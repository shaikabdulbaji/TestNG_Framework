package b21Subcatgeorygroups_inTestNG_UsingRegularExpressions;

import org.testng.annotations.Test;

public class aLogin {
	
	@Test(priority = 1,groups= {"windows.smoke","ios.sanity","windows.login","linux.all"})
	public void loginwithvalididandvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login");
	}
	
	@Test(priority = 2,groups= {"windows.sanity","ios.login","linux.all"})
	public void loginwithInvalididandvalidpassword()
	{
		System.out.println("loginwithInvalididandvalidpassword - Login");
	}
	
	@Test(priority = 3,groups= {"linux.sanity","windows.regression","ios.login","windows.all"})
	public void loginwithvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandInvalidpassword - Login");
	}
	
	@Test(priority = 4,groups= {"windows.smoke","ios.sanity","linux.login","windows.all"})
	public void loginwithInvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login");
	}
	
	@Test(priority = 5,groups= {"windows.sanity","ios.regression","linux.login","windows.all"})
	public void loginwithNoidandNopassword()
	{
		System.out.println("loginwithNoidandNopassword - Login");
	}

}
