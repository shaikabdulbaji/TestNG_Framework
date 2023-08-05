package b41ControllingDataProviderparalleltests_countbyusingdataproviderthreadcount;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * Before parallel attribute the all tests will run in sequentially one by one.
 
 * After parallel attribute the all tests will run in at a time and how many email
   id's we give that many browsers will open at a time and execute the tests but 
   there is some problem while doing this if we have 100 email id's then that many 
   browsers will open at a time and that will degrade our performance or my system
   can't handle that many browsers and my network wil also not support simply it is
   not "Thread Safe".
   
 * To overcome this we go to data-provider-thread-count="2". 
   Here the "2" is at a time it will open 2 browsers and after execution it will agin open two browsers 
   in place of "2" we can give aany number.
 */

public class aDemo {
	
	@Test(dataProvider = "getTestData")
	public void validCredentials(String[] str)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();   
		driver.get("https://tutorialsninja.com/demo");  
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(str[0]);
		driver.findElement(By.id("input-password")).sendKeys(str[1]);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
		driver.quit(); 
	}
	
	@DataProvider(name = "getTestData", parallel = true)
	public String[][] datasupplier()
	{
		String [][] data = {{"amotooricap1@gmail.com","12345"},
				{"amotooricap2@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"},
				{"amotooricap12@gmail.com","12345"},
				{"amotooricap13@gmail.com","12345"},
				{"amotooricap1@gmail.com","12345"},
				{"amotooricap2@gmail.com","12345"},
				{"amotooricap3@gmail.com","12345"},
				{"amotooricap12@gmail.com","12345"},
				{"amotooricap13@gmail.com","12345"}};
		
		return data;
	}

}
