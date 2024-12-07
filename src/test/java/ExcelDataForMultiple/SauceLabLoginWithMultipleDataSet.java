package ExcelDataForMultiple;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceLabLoginWithMultipleDataSet {
	
	public WebDriver driver;

	@DataProvider(name="Rediff")
	public Object[][] getAnotherSheetData() throws IOException {
	    // Specify the name of the second sheet
	    Object[][] data = ExcelData.readFromExcelRediffData("SauceLoginusernames");
	    return data;
	}
	
	
	@Test(dataProvider = "Rediff",dataProviderClass = ExcelData.class)
	public void rediffLoginTest(String username, String password) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.quit();

	}
}
