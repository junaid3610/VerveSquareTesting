import java.awt.Scrollbar;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraTesting {
	
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.myntra.com");  // Open the website
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Implicit wait
//        driver.manage().window().maximize();  // Maximize the window
//        
//        // to hover the men tab 
//		 WebElement MenTab = driver.findElement(By.xpath("//div[@class=\"desktop-navLinks\"]/div[1]"));
//		 Actions act = new Actions(driver);
//		 act.moveToElement(MenTab).perform();
//		 
//		 // to select the phone-cases from fashion accessories
//		 driver.findElement(By.xpath("(//div[@class=\"desktop-categoryContainer\"]/li[5]/ul/li[11])[1]")).click();
//		 
//		// to select 3 row 3 column element
//		 Thread.sleep(2000); 						// to see the actions clearly
//		 driver.findElement(By.xpath("//div[@class=\"search-searchProductsContainer row-base\"]//ul/li[13]")).click();
//		
//		// to click on add to bag
//		 //	 Thread.sleep(2000); 
//		 driver.findElement(By.xpath("//div[text()=\"ADD TO BAG\"]")).click();

		driver.get("https://practice-automation.com/");
		
		driver.manage().window().maximize();
//		
		
		// to scroll down
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0, 500);");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class=\\\"wp-block-button__link wp-element-button\\\"])[8]")));
//		element.click();
//		driver.findElement(By.xpath("//a[text()=\"Form Fields\"]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[1]/div/a"));
		element.click();
		 
		// to scroll down
		JavascriptExecutor j= ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(0, 1500);");
		
		
		
		
	}
	
	
	
	

}
