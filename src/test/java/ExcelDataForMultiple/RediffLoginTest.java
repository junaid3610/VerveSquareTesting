package ExcelDataForMultiple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffLoginTest {
	
	public WebDriver driver;
	
	
	@Test(dataProvider = "Rediff",dataProviderClass = ExcelData.class)
	public void rediffLoginTest(String username, String password) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
		driver.quit(); 
		
		
	}
	

}
