package MyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataFromConfigFile {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// to access the config File
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\VerveSquareTesting1\\src\\main\\java\\MyData\\Data.properties");
		Properties p = new Properties();
		// to load thi file 
		p.load(fis);          
		p.getProperty("browser");
		String Myurl = p.getProperty("url");
	
		WebDriver driver = new ChromeDriver();
		driver.get(Myurl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// fetching data for FirstName from config file
		String FirstName = p.getProperty("firstname");			
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(FirstName);
		
		//fetching data for LastName from config file
		String LastName=p.getProperty("lastname");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(LastName);
		
		//fetching data for Address from config file
		String Address=p.getProperty("address");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys(Address);
		
		//fetching data for Email from config file
		String Email=p.getProperty("email");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(Email);
		
		//fetching data for Phone Number from config file
		String PhoneNumber = p.getProperty("phonenumber");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys(PhoneNumber);
		
		// clicking on the Male radio Button
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
		
		// clicking on the Hobbies Checkbox
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox3\"]")).click();
		
		// click on language to open the language options
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		//select english language from list
		driver.findElement(By.xpath("//a[text()=\"English\"]")).click();
		
		// Click on an element outside the dropdown to close the list
		WebElement outsideElement = driver.findElement(By.xpath("//body")); // Or any other specific element
		outsideElement.click();
		
		// selecting the skill from the list by select class methods
		WebElement skll = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s= new Select(skll);
		s.selectByVisibleText("Linux");
//		Thread.sleep(2000);
//		s.selectByVisibleText("Javascript");
//		Thread.sleep(2000);
//		s.selectByVisibleText("Mac");
//		Thread.sleep(2000);
//		s.selectByVisibleText("Networks");
				
		// empty country list
		driver.findElement(By.xpath("//option[text()=\"Select Country\"]")).click();
		
		// selecting coutry from the list
		driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
		//clicking on the japan from the dropdown
		driver.findElement(By.xpath("//li[text()=\"Japan\"]")).click();
		
		//selcting the date of birth for Year
		WebElement yr = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select Year = new Select(yr);
		Year.selectByVisibleText("1996");
		
		//selcting the date of birth for Month
		WebElement mnth = driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		Select Month = new Select(mnth);
		Month.selectByVisibleText("June");
		
		//selcting the date of birth for day
		WebElement d = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		Select Day = new Select(d);
		Day.selectByVisibleText("23");
		
		//fetching data for Password from config file
		String Password = p.getProperty("password");
		driver.findElement(By.xpath("//input[@ng-model=\"Password\"]")).sendKeys(Password);
		// Confirm Password field
		driver.findElement(By.xpath("//input[@ng-model=\"CPassword\"]")).sendKeys(Password);
		
		// clicking on the Refresh Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=\"Refresh\"]")).click();
		
		// using explicit wait 
 //		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the element is visible
 //       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"navbar-collapse collapse navbar-right\"]//li[5]"))).click();
		
			
// Now launching new url that is Slider		s
		String SliderURL = p.getProperty("sliderurl");
		driver.get(SliderURL);
        
		//scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500);");
		driver.findElement(By.xpath("//a[text()=\"Slider\"]")).click();
		
		// handelling the slider
//		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
//		driver.switchTo().frame(frame);
//		WebElement element = driver.findElement(By.xpath("//div[@id=\"slider\"]"));
	//dragging by actions class methods	
//		Actions act = new Actions(driver);
//		act.dragAndDropBy(element, 10, 300).perform();
//		act.click().perform();
		
		// Switch back to the main document
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//a[text()=\"Draggable\"]")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement draggableLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Draggable']")));
//		draggableLink.click();
		
		
		
		
		
	}
		
}
