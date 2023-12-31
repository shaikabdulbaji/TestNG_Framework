package b72Default_TestNGreports_andtheir_realtimeusage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aLogin {
		
		WebDriver driver;
		
		@BeforeSuite
		public void beforesuite()
		{
			System.out.println("Before Suite");
		}
		
		@AfterSuite
		public void aftersuite()
		{
			System.out.println("After Suite");
		}
		
		@BeforeTest
		public void beforetest()
		{
			System.out.println("Before Test");
		}
		
		@AfterTest
		public void aftertest()
		{
			System.out.println("After Test");
		}
		
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("Before Class");
		}
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("After Class");
		}
		
		@BeforeMethod
		public void setUp()
		{
			System.out.println("Before Method");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // Launch ChromeBrowser
			driver.manage().window().maximize();   // Maximize Browser Window
			driver.get("https://tutorialsninja.com/demo");  // Application URL
		}
		
		
		@AfterMethod
		public void tearDown()
		{
			System.out.println("After Method");
			driver.quit();
		}
		
		@Test(priority = 1)
		public void validIdandvalidPassswordCredentials()
		{
			System.out.println("Test 1");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information abcd']")).isDisplayed());
			
		}
		
		@Test(priority = 2)
		public void InvalidIdandInvalidPassswordCredentials()
		{
			System.out.println("Test 2");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("input-email")).sendKeys("amotooricap12@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed(), "Warning: No match for E-Mail Address and/or Password.");

		}
		
		@Test(priority = 3)
		public void validIdandInvalidPassswordCredentials()
		{
			System.out.println("Test 3");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed(), "Warning: No match for E-Mail Address and/or Password.");

		}
		
		@Test(priority = 4)
		public void EmptyIdandEmptyPassswordCredentials()
		{
			System.out.println("Test 4");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("input-email")).sendKeys(" ");
			driver.findElement(By.id("input-password")).sendKeys(" ");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed(), "Warning: No match for E-Mail Address and/or Password.");

		}
		
		@Test(priority = 5)
		public void InvalidIdandvalidPassswordCredentials()
		{
			System.out.println("Test 5");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Login']")).click();
			driver.findElement(By.id("input-email")).sendKeys("amotooricap1123@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed(), "Warning: No match for E-Mail Address and/or Password.");

		}

}



