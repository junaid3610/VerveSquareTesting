package ExcelDataForMultiple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RediffLoginTestandSauceLabLoginTest {
	
	public WebDriver driver;
	
	// Rediff Login
	
	@Test(priority = 1,dataProvider = "Rediff",dataProviderClass = ExcelData.class)
	public void rediffLoginTest(String username, String password) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	
	}
	
	// ==========       SauceLabLogin ==============
	
	@Test(priority = 1,dataProvider = "SauceLabLogin",dataProviderClass = ExcelData.class)
	public void SaouceLabLoginTest(String username, String password) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		

	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	
}
