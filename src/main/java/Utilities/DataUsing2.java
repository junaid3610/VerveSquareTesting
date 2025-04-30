package Utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DataUsing2 {
	
	
	public WebDriver driver;
	
	@Test
	 public static void LoginTest() {
	        // Path to your Excel file
	        String filePath = "C:\\Users\\admin\\Desktop\\Rediff Data.xlsx";
	        String sheetName = "TesterRegistration";
	        int rowIndex = 1; // Fetch data from the second row (0-based index)

	        // Fetch login data from Excel
	        String[] loginData = Datafetchcode1.getLoginData(filePath, sheetName, rowIndex); //Datafetchcode1 is the class name where the code is written
	        String username = loginData[0];
	        String password = loginData[1];

	        // Set up WebDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open the login page
	            driver.get("https://www.saucedemo.com/v1/");
	            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

	            // Locate and interact with elements
	            WebElement usernameField = driver.findElement(By.id("user-name")); 
	            WebElement passwordField = driver.findElement(By.id("password")); 
	            WebElement loginButton = driver.findElement(By.className("btn_action"));

//	     // using Explicit wait
//
//	            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
//	            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
//	            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
//	            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
//	            
	           
	            // Perform login
	            usernameField.sendKeys(username);
	            passwordField.sendKeys(password);
	            loginButton.click();

	            // Add verification or assertions as needed
	            System.out.println("Login completed successfully!");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	//            driver.quit();
	        
	    }
	}
	
	
	

}
