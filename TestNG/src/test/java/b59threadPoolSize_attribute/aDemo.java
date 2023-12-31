package b59threadPoolSize_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * threadPoolSize is used beside invocationcount for if we give threadPoolSize=2
   then two browsers will open at a time and executes, if we want to give more 
   it's our wish.
 */ 

public class aDemo {
	
	@Test(invocationCount = 10, threadPoolSize=2)
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
