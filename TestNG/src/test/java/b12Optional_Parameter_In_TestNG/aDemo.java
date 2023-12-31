package b12Optional_Parameter_In_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Mainly note this points : 
   * If we want to create "testng.xml" file for one testcase then we execute that testcase and 
     after successfully running that testcase we create "testng.xml" file by right click on that 
     testcase and go to TestNG and click on convert to testng class.
   * If we want to create "testng.xml" file for more than one testcase then we execute that 
     testcases and after successfully running that testcases we create "testng.xml" file by select 
     both testcases and right click on that testcases and go to TestNG and click on convert to 
     testng class.
   * If we want to create "testng.xml" file for more than two testcases(Suite) then we execute that 
     testcases and after successfully running that testcases we create "testng.xml" file by select
     both testcases and right click on that testcases and go to TestNG and click on convert to 
     testng class.
     
   * In parameter("url") and String URL both url's are not mandatorily same in place of String URL
     we use String abdul also use our wish and compulsory both String URL and driver.get(URL) 
     are same.
     
   * @Optional("https://tutorialsninja.com/demo") if we pass this Optional parameter this 
     will work when we not pass any value in parameter of testng.xml at that time this
     Optional parameter comes in to point.
     
 */

public class aDemo {
	
	@Parameters({"url","email","password"})
	@Test
	public void validCredentials(@Optional("https://tutorialsninja.com/demo") String URL, String Email, String Password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get(URL);  // Application URL
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(Email);
		driver.findElement(By.id("input-password")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
		driver.quit();  // Quite or closing the Browser
	}

}
