package b31SeparatingDataProvider_into_separateClass_using_dataProviderClass_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * If we move the "DataProvider" method to seperate class then the main test case 
   will not run we get exception to overcome this we use 
   @Test(dataProvider = "getTestData", dataProviderClass = bDataProvider.class)
   at tags level. bDataProvider is dataprovider class, dataProviderClass is attribute.
 */


public class aDemo {
	
	@Test(dataProvider = "getTestData", dataProviderClass = bDataProvider.class)
	public void validCredentials(String email, String password)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
		driver.quit();  // Quite or closing the Browser
	}
	

}
