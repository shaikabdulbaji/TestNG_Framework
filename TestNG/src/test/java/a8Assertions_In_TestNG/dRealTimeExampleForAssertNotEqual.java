package a8Assertions_In_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dRealTimeExampleForAssertNotEqual {

	@Test(enabled = false)
	public void verifyingTitleOne()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Your Store";
		
		Assert.assertNotEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}
	
	@Test
	public void verifyingTitleTwo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Your";
		
		Assert.assertNotEquals(actualTitle, expectedTitle);
		
		driver.quit();
	}
	
	
}
