import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FailTestcasesSreenshot {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void Setup() {
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
	
	}
	
	@Test
	public void VerifyTitle() 
	{
		String ActualTitle = driver.getTitle();
		String Expected="Slider , jQuery UI";
		Assert.assertEquals(ActualTitle, Expected);		
	}

	@AfterMethod
	public void fail(ITestResult result) throws IOException 
	{
		if(ITestResult.FAILURE==result.getStatus()) 
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\admin\\Desktop\\Music\\Slider.jpg");
			FileUtils.copyFile(src, dest);
			
		}

	}

	@AfterTest
	public void TearDown() {
		driver.close();
	}
	
	
	
	
	

}
