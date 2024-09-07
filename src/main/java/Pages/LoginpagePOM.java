package Pages;

import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginpagePOM  {
	 WebDriver driver;
	    
	    // Object Repository
	    						//declaration 
	    // Username 
	    @FindBy(id  ="user-name")  
	    private WebElement usernameField; 
	    
	    // Password
	    @FindBy(xpath="//input[@type='password']")  
	    private WebElement passwordField;
	    
	    // Login Button
	    @FindBy(xpath="//input[@type='submit']")  
	    private WebElement loginButton;

	    									// Constructor Initialization 
	 
	 // Constructor Initialization
	    public LoginpagePOM(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    
	    
	    									// Usage of methods
	    
	    // Enter username
	    public void enterUsername() {
	        usernameField.sendKeys("standard_user");
	    }

	    // Enter password
	    public void enterPassword() {
	        passwordField.sendKeys("secret_sauce");
	    }

	    // Click on Login Button
	    public void clickLogin() {
	        loginButton.click();
	    }
	
	
	
	
	
	
	
	

}
