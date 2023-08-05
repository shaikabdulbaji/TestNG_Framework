package b29Naming_DataProvidermethod_using_nameattribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * If we want to login into that tutorials nija site with 1 credentials it is okay but i 
   want to login with 1000 credentials then we go for DataDriven testing.
  
 * In last session dataSupplier is method name we will give that method name to main test 
   case it will execute. In place of giving method name we have one alternate option we use
   name attribute, we create the name attribute above dataSupplier method
   @DataProvider(name = "getTestData") that name we give to main test case like this
   @Test(dataProvider = "getTestData") the tests will run as usual.
 */


public class aDemo {
	
	@Test(dataProvider = "getTestData")
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
