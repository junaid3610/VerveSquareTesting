package Driver;

import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class ChromBrowserBase {
	 protected WebDriver driver;
	
	@BeforeSuite
	public void tearup() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println(driver.getTitle());	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log(driver.getTitle());
		
		
			
	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
		
	}

}
