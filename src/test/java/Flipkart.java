import java.awt.Scrollbar;
import java.awt.Window;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
		
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("mobile"); 	
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.xpath("(//div[@class=\"col col-7-12\"])[1]")).click();
		Thread.sleep(2000);
//		 Dimension dimension = new Dimension(800, 600);
//	     driver.manage().window().setSize(dimension);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, 500);"); 
		
		// add to cart
//		driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
				

		
		
		
		
		
		
	}
	
	
}
