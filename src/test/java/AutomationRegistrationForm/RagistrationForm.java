package AutomationRegistrationForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class RagistrationForm {
	
	public WebDriver driver;
	
	@Test(dataProvider = "Ragistration",dataProviderClass = ExcelDataCode.class)
	public void TestingRegistrationForm(String FirstName, String LastName,String EmailAddress,String Address,int PhoneNumber,String password,String Confirmpassword) throws InterruptedException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	// FirstName	
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(FirstName);
	// Lastname	
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(LastName);
	// address	
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys(Address);
	// email
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(EmailAddress);
	// phone Number
//		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys(PhoneNumber);
		
		
		
//		driver.findElement(By.id("login-button")).click();
//		Thread.sleep(2000);
//		driver.quit();

	}

}
