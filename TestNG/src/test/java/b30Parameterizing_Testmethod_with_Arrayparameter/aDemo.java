package b30Parameterizing_Testmethod_with_Arrayparameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * If we have more email id's and passwords then we go to "Parameterizing Test method 
   with Array parameter" concept like this.
   driver.findElement(By.id("input-email")).sendKeys(str[0]);
   driver.findElement(By.id("input-password")).sendKeys(str[1]);
 */


public class aDemo {
	
	@Test(dataProvider = "getTestData")
	public void validCredentials(String[] str)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(str[0]);
		driver.findElement(By.id("input-password")).sendKeys(str[1]);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
		driver.quit();  // Quite or closing the Browser
	}
	
	@DataProvider(name = "getTestData")
	public String[][] datasupplier()
	{
		String [][] data = {{"amotooricap1@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"},
				{"amotooricap12@gmail.com","12345"},
				{"amotooricap13@gmail.com","12345"}};
		
		return data;
	}

}
