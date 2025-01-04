package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestexcelBase {

	public WebDriver driver;

	// Rediff Login

	@Test(enabled = false ,priority = 1, dataProvider = "Rediff", dataProviderClass = excelBasedata.class)
	public void rediffLoginTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();

	}
	
	@Test(priority = 2,dataProvider = "Rediff",dataProviderClass = excelBasedata.class)
	public void SauceLab(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
