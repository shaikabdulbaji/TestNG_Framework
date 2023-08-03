package b64ImplementingListenersatSuiteLevelintestngxmlfile;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
 * In previous session we have learned how to create MyTestListeners by go to source and click on
   Override unimplemented methods.
 * This session is continuation of previous session in previous session we have learned how to 
   create MyTestListeners and that MyTestListeners is how to link to aLogin class by
   @Listeners(MyTestListeners.class) MyTestListeners is class name.
   In this we learn only how to link that MyTestListeners to only one class.
   
 * In next session we learn how to link that MyTestListeners at suite level, suite level means under
   suite there are so many classes, we can link that MyTestListeners to multiple classes.
 */


public class aLogin {
	
	@Test(priority = 1)
	public void loginwithvalididandvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login -->"+Thread.currentThread().getId());
	}
	
	@Test(priority = 2)
	public void loginwithInvalididandvalidpassword()
	{
		System.out.println("loginwithInvalididandvalidpassword - Login -->"+Thread.currentThread().getId());
		Assert.assertTrue(false);
	}
	
	@Test(priority = 3, timeOut = 1000)
	public void loginwithvalididandInvalidpassword() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("loginwithvalididandInvalidpassword - Login  -->"+Thread.currentThread().getId());
	}
	
	@Test(priority = 4, dependsOnMethods = {"loginwithInvalididandvalidpassword"})
	public void loginwithInvalididandInvalidpassword()
	{
		System.out.println("loginwithvalididandvalidpassword - Login -->"+Thread.currentThread().getId());
	}
	
	@Test(priority = 5)
	public void loginwithNoidandNopassword()
	{
		System.out.println("loginwithNoidandNopassword - Login -->"+Thread.currentThread().getId());
	}

}
