import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTesting {
	
	@Test(dataProvider = "getData")
	public void test(String user, String pass) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
//		TakesScreenshot src = (TakesScreenshot)driver;
//		src.getScreenshotAs(OutputType.FILE);
//		File dest= new File("C:\\Users\\admin\\Desktop\\Music\\loginDemo.jpg");
//		FileUtils.copyFile(src, dest);
										// take screenshot
		try { 
 
            // Take a screenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Specify the destination file path
            File destFile = new File("C:\\Users\\admin\\Desktop\\Music\\loginDemo1.jpg");

            // Copy the screenshot to the destination file
            FileUtils.copyFile(srcFile, destFile);

 //           System.out.println("Screenshot saved at: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error while saving the screenshot: " + e.getMessage());
        }
	
		driver.close();
	}
	
	@DataProvider(name="getData")
	public Object[][] dataset() {
	
		return new Object[][] 			
				{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user" , "secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"}
		
				};

	}
	

}
