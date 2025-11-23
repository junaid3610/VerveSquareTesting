package BasicJavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoPractice1 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://jqueryui.com/draggable/");
	        System.out.println("Initial URL: " + driver.getCurrentUrl());

	        // Switch to iframe containing the draggable element
	        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

	        // Locate the draggable element
	        WebElement drag = driver.findElement(By.id("draggable"));

	        // Perform drag using offset (x=210px, y=106px)
	        Actions act = new Actions(driver);
	        act.dragAndDropBy(drag, 210, 106).perform();

	        Thread.sleep(2000);
		
	
		
	}

}
