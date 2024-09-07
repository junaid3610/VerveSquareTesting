import org.testng.annotations.Test;

import Driver.ChromBrowserBase;
import Pages.LoginpagePOM;

public class LoginTest extends ChromBrowserBase {
	
	
	// Enter Username
	@Test(priority = 1)
	public void EnterUsername() {
		LoginpagePOM s= new LoginpagePOM(driver);	
		s.enterUsername();		
	}
	
	
	// Enter Password
	
	@Test(priority = 2 )
	public void EnterPassword() {
		LoginpagePOM s= new LoginpagePOM(driver);	
		s.enterPassword();;		
	}
	
	
	
	// click on Login
	
	@Test(priority = 3)
	public void ClickLogin() {
		LoginpagePOM s= new LoginpagePOM(driver);	
		s.clickLogin();		
	}

	
	
}
