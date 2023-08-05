package b24ignoreMissingDependencies_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * In some cases all or some methods are inter link to each other in that cases inbetween 
   execution one test is fail then the remaining test cases are also fail to overcome this 
   probelm for that remaining tests which are failing or skipping at beside of @Test 
   -----@Test(dependsOnMethods = {"userLogin"}, ignoreMissingDependencies = true)----
   use this ignoreMissingDependencies = true then the rest of the tests was skipped or 
   failed but they will run.
 */


public class aDemo {
	
	WebDriver driver ;
	
	@Ignore
	@Test
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
	
	@Test(dependsOnMethods = {"userLogin"}, ignoreMissingDependencies = true)
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
	
	@Test(dependsOnMethods = {"userLogin", "addingProducttoWhislist"}, ignoreMissingDependencies = true)
	public void removeProductfromWhislist()
	{
		driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']//p")).getText().equals("Your wish list is empty."));
	}

}
