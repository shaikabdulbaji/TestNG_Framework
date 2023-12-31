package a9HardAssertions_and_SoftAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bSoftAssertions {
	
	@Test
	public void sampleMethod()
	{
		// In this HardAssertions if one code fails remaining code will not execute.
		// To overcome this problem we go for "SoftAssertions"
		// SoftAssertions - In this SoftAssertions if one code fails remaining code will execute and throw exception in last
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		SoftAssert softAssert = new SoftAssert();
		
		String actualTitle = driver.getTitle();
		//String expectedTitle = "Your Store";
		String expectedTitle = "Your StoreABC";
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://tutorialsninja.com/demo";
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.name("search")).sendKeys("HP", Keys.ENTER);
		softAssert.assertTrue(driver.findElement(By.xpath("//a[text()='HP LP3065']")).isDisplayed());
		
		driver.quit();
		
		softAssert.assertAll();
		
	}

}
