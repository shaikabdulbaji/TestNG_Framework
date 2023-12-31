package b57invocationCount_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// invocationCount means same test case will repeate again and again what the number was given

public class aDemo {
	
	@Test(invocationCount = 10)
	public void sample()
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();   
		driver.get("https://www.calculator.net/random-number-generator.html");
		
		driver.findElement(By.name("submit1")).click();
		
		System.out.println(driver.findElement(By.xpath("(//h2[text()='Result']/following::p)[1]")).getText());
	
		driver.quit();
	}
	

}
