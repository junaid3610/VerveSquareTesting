package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class Twodata {
	@Test
	public void Test() throws IOException {
	    // Fetch data from onedata class
	    String[] userData = onedata.testdata();
	    String firstname = userData[0];
	    String lastname = userData[1];
	    String email = userData[2];
	    String phonenumber = userData[3]; // Assuming phone number is at index 3 and is fetched as a string

	    // Set up WebDriver  
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

	    // Use the fetched data
	    driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(firstname);  // First name
	    driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys(lastname);   // Last name
	    driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email);          // Email
	    driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys(phonenumber);     // Phone number (Assumed to be a string)
 
	    // Close the driver
	//    driver.quit();
	}

}

