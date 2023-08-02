package b43expectedExceptionsattribute;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Before "timeOut" attribute the test case was running with in 7 seconds but client want to run that 
   test case in 6 seconds at that time we use "timeOut" attribute.
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