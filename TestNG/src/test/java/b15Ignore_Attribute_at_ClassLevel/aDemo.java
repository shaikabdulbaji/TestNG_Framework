package b15Ignore_Attribute_at_ClassLevel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * In this 15th session "@Ignore" and we have to put that parameter on above of "class".
 * if we put @Ignore at class level then how many no.of testcases are there they will not run.
 */

@Ignore
public class aDemo {

	@Test
	public void validCredentials()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
		driver.quit();  // Quite or closing the Browser
	}
	
	@Test
	public void validCredentials1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Your Store";
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}

	@Test
	public void validCredentials2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		String actualurl = driver.getTitle();
		System.out.println(actualurl);
		
		String expectedurl = "https://tutorialsninja.com/demo";
		
		Assert.assertNotEquals(actualurl, expectedurl);
		
		driver.quit();
		
	}

	
}
