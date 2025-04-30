package Utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class threeDemo {
	
	
	 @Test
	  public void Test2() throws IOException {
	        // Fetch data from onedata class
		 String[] userData = onedata.testdata();
	        String firstname = userData[0];
	        String lastname = userData[1];
//	        String email = userData[2];
	        String phonenumber = userData[3];
		 	
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/v1/");
	        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
 
	     // Use the fetched data
	        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(firstname);
	        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(lastname);
	          
	        
	 }

}
