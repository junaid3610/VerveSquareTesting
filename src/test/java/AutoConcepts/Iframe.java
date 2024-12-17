package AutoConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	
	public static void main(String[] args) throws IOException {
		
		// to access the config File
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\VerveSquareTesting1\\src\\test\\java\\AutoConcepts\\TestingDataForPractice");
		Properties p = new Properties();
		// to load thi file
		p.load(fis);          
		p.getProperty("browser");
		String URL = p.getProperty("url");
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	// to click on switch to button
		WebElement SwitchTo = driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//li[4]"));
		SwitchTo.click();
		// to click on iframe
		driver.findElement(By.xpath("//a[text()=\"Frames\"]")).click();
		
		// switch to iframe
		WebElement frame = driver.findElement(By.id("singleframe"));
		// switch to iframe
		driver.switchTo().frame(frame);
		// to enter the text in the input field
		String Name=p.getProperty("firstname");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(Name);
		
		//scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()=\"Iframe with in an Iframe\"]")).click();
		
		// to click on ALert
		WebElement Switch = driver.findElement(By.xpath("//ul[@class=\"nav navbar-nav\"]//li[4]"));
		Switch.click();
		// to click on ALert
		driver.findElement(By.xpath("//a[text()=\"Alerts\"]")).click();
		// to open an alert
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		// now to handle the alert pop-up we need to switch the selenium focus from main page to alert
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.dismiss();
		
		
		
		
	}
	

}
