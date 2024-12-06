import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestingPractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://ultimateqa.com/automation");
//		driver.manage().window().maximize();
//		System.out.println("The Title is => "+driver.getTitle());
//		System.out.println("The URL is => "+ driver.getCurrentUrl());
//	//	driver.close();
//		driver.findElement(By.xpath("(//a[text()=\"I want a free DISCOVERY SESSION\"])[1]")).click();
//		System.out.println("The current url is "+ driver.getCurrentUrl());
////		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//// scroll down		
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("scroll(0,1000 )");
		
	

		// filling assessment registration
		//name
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("ABC");
//		//email
//		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abc@gmail.com");
//		//Role
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("QA Engineer");
//		//company name
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("IBM");
//		//select from list
//		driver.findElement(By.xpath("//div[@class=\"cu-select-selection__text ng-star-inserted\"]")).click();
		
		
		
		try {
            // Maximize browser window
            driver.manage().window().maximize();
            
            // Open the URL
            driver.get("https://ultimateqa.com/automation");
            
            // Wait for the page to load (use an explicit wait if necessary)
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
            // Locate the button and click it
            driver.findElement(By.xpath("(//a[text()=\"I want a free DISCOVERY SESSION\"])[1]")).click();;
            
            // Scroll down to make the form visible
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0, 500);"); // Adjust scroll amount as needed
            
            // Wait briefly for form visibility
            Thread.sleep(2000);
            
            // Fill out the form
           //name
            driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("ABC");
          //Email
            driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abc@gmail.com"); 
          //Role
            driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("QA Engineer"); 
          //Company
            driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("IBM");
            
            //click on box
            driver.findElement(By.xpath("//div[@class=\"cu-dropdown cu-dropdown_fullwidth cu-select__dropdown\"]")).click();
            //select Test automation optimization
            driver.findElement(By.xpath("//div[text()=\" Test automation optimization \"]")).click();
            //write message in TextBox
            WebElement message = driver.findElement(By.xpath("(//div[@class=\"ng-tns-c2495704340-0 ng-star-inserted\"])[6]//textarea"));
            message.sendKeys("Hi,this is Automation Testing Script for Testing purpose. So take care of you and your code");
 // handelling iframe
//            WebElement captcha = driver.findElement(By.xpath(""));
//            driver.switchTo().frame("captcha");
//            driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[2]")).click();
            
            Thread.sleep(2000);
// Navigate Back
            driver.navigate().back();
            driver.navigate().refresh();
  // scrool down
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0, 500);"); // Adjust scroll amount as needed
            
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[text()=\"Big page with many elements\"]")).click();
            
           
            
            
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the browser
            Thread.sleep(5000);
            driver.quit();
        }
		
		
		
		
		
		
	}
}
