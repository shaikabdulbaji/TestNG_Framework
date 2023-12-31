package b58invocationTimeOut_attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
 * invocationTimeOut means Maximun time in which all invocations of the test method 
   should complete.
 * With in the given time it will not execute it throws "ThreadtimeoutException"
 * 1000=1sec. like milliseconds
 */ 

public class aDemo {
	
	@Test(invocationCount = 5, invocationTimeOut = 50000)
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
