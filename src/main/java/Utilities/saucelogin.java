package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class saucelogin {
	public WebDriver driver;
	
	@Test(priority = 1,dataProvider = "Rediff",dataProviderClass = excelBasedata.class)
	public void SauceLab(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	
		driver.close();
	}

}
