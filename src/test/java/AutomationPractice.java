import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class AutomationPractice {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Implicit wait
		
		// to launch the website
		driver.get("https://practice-automation.com/");
		// to maximize the window
		driver.manage().window().maximize();
		// to scroll down
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0, 500);");
		
		// explicite wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\\\"wp-block-button__link wp-element-button\\\"])[8]")));
//		element.click();
		
		// click on form
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[1]/div/a"));
		element.click();
		 
		
		// to scroll down
		JavascriptExecutor j= ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(0, 1500);");
		Thread.sleep(2000);
		// to click on about
		driver.findElement(By.xpath("//a[text()=\"About\"]")).click();
		
		// Create an instance of Actions
        Actions actions = new Actions(driver);

        // Locate the element to hover over
        WebElement act = driver.findElement(By.xpath("//span[text()='Blog']"));

        // Perform the hover action
        actions.moveToElement(act).perform();
		
		
		
		
		
		
	}

	

}
