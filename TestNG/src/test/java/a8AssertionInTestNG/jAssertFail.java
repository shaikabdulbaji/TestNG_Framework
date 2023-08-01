package a8AssertionInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jAssertFail {
	
	@Test
	public void sampleMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		if(driver.findElement(By.linkText("MacBook")).isDisplayed())
		{
			Assert.fail("MacBook is Displayed, Hence Failed");
		}
	}
	
	

}
