package Driver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice {
	
	WebDriver driver;  // Declare driver at class level

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();     // Initialize driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/v1/");
        System.out.println(driver.getTitle());
        Reporter.log(driver.getTitle());
    }

    @Test(priority = 1)
    public void username() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void password() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void login() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
	
	   

	
	

}