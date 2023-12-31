package b22TestDependency_inTestNG_using_dependsOnMethods_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * If the main test will fail rest of the tests was skipped.
 * When you give dependsOnMethods parameter with priority parameter, the priority parameter 
   was override.
 * If we put "@ignore" on main test method the TestNGException will come.
 * If we delete the main test method the TestNGException will come along with method not 
   exist will display. 
 */


public class aDemo {
	
	WebDriver driver ;
	
	@Test(priority=3)
	public void userLogin()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); // Launch ChromeBrowser
		driver.manage().window().maximize();   // Maximize Browser Window
		driver.get("https://tutorialsninja.com/demo");  // Application URL
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Edit your account information']")).isDisplayed());
		
	}
	
	@Test(priority=2, dependsOnMethods = {"userLogin"})
	public void addingProducttoWhislist()
	{
		driver.findElement(By.name("search")).sendKeys("HP", Keys.ENTER);
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
		driver.findElement(By.xpath("//a[@id='wishlist-total']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		WebElement wishlist = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Wish List")));
		wishlist.click();
		
		Assert.assertTrue(driver.getTitle().equals("My Wish List"));
	}
	
	@Test(priority=1, dependsOnMethods = {"userLogin", "addingProducttoWhislist"})
	public void removeProductfromWhislist()
	{
		driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//p")).getText().equals("Your wish list is empty."));
	}

}
