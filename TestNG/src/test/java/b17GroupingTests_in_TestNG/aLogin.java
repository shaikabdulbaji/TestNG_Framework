package b17GroupingTests_in_TestNG;

import org.testng.annotations.Test;

public class aLogin {
	
	@Test(priority = 1)
	public void loginwithvalididandvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login");
	}
	
	@Test(priority = 2)
	public void loginwithInvalididandvalidpassword()
	{
		System.out.println("loginwithInvalididandvalidpassword - Login");
	}
	
	@Test(priority = 3)
	public void loginwithvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandInvalidpassword - Login");
	}
	
	@Test(priority = 4)
	public void loginwithInvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login");
	}
	
	@Test(priority = 5)
	public void loginwithNoidandNopassword()
	{
		System.out.println("loginwithNoidandNopassword - Login");
	}

}
