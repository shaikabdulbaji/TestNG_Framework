package b68and69uBase;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Base {
	
	public void takeScreenShot(WebDriver driver, String testName)
	{
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String des = System.getProperty("user.dir")+"\\Screenshots\\"+testName+generateTimeStamp()+".png";
		
		try {
			FileUtils.copyFile(scr, new File(des));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
	// This method is for generating timeStamp that to not to override the old screenshots.
	// After generating timeStamp give at destinanation after test name
	public String generateTimeStamp()
	{
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	}

}
