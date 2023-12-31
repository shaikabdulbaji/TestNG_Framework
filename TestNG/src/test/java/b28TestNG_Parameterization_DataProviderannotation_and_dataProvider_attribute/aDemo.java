package b28TestNG_Parameterization_DataProviderannotation_and_dataProvider_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * If we want to login into that tutorials nija sites with 1 credentials it is okay but 
   i want to login with 1000 credentials then we go for DataDriven testing.
 */


public class aDemo {
	
	@Test(dataProvider = "datasupplier")
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
	
	@DataProvider
	public String[][] datasupplier()
	{
		String [][] data = {{"amotooricap1@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"},
				{"amotooricap12@gmail.com","12345"},
				{"amotooricap13@gmail.com","12345"}};
		
		return data;
	}

}
