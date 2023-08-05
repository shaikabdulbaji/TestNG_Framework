package b43expectedExceptions_attribute;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Before expectedExceptionsattribute in test case while execution time some webElements
   will not found at that time the selenium will throw "NoSuchElementException" to 
   overcome this we go to "expectedExceptionsattribute".
   
 * After expectedExceptionsattribute in test case while execution time some webElements
   will not found at that time the selenium will throw "NoSuchElementException" by using 
   expectedExceptionsattribute like this in test case 
   @Test(expectedExceptions = {NoSuchElementException.class}) the exception will handle.
 */

public class aDemo {
	
	WebDriver driver;
	
	@Test(expectedExceptions = {NoSuchElementException.class})
	public void validCredentials()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://omayo.blogspot.com/");  // Application URL

		driver.findElement(By.id("ta123")).sendKeys("Abdul");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
