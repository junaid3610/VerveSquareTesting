package ExcelDataForMultiple;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InvalidFormatException, InterruptedException {
		 
		// fetching and using for FirstName From the sheet
		FileInputStream fis= new FileInputStream("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");
		String FirstName=WorkbookFactory.create(fis).getSheet("TesterRegistration").getRow(1).getCell(0).getStringCellValue();
		System.out.println("Firstname is- "+FirstName);	
		
	 	// fetching and using for LastName From the sheet
		FileInputStream fs= new FileInputStream("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");
		String LastName = WorkbookFactory.create(fs).getSheet("TesterRegistration").getRow(1).getCell(1).getStringCellValue();
		System.out.println("Lastname is- "+LastName);	
			
		// fetching Data For address		
		FileInputStream ad= new FileInputStream("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");
		String Address = WorkbookFactory.create(ad).getSheet("TesterRegistration").getRow(1).getCell(4).getStringCellValue();
		System.out.println("Address is- "+Address);	
		
		//fetching data for email				
		FileInputStream em= new FileInputStream("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");
		String email = WorkbookFactory.create(em).getSheet("TesterRegistration").getRow(2).getCell(2).getStringCellValue();
		System.out.println("Email is- "+email);
		
		//fetching data for Phone Number				
		FileInputStream ph= new FileInputStream("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");
		long PhN = (long) WorkbookFactory.create(ph).getSheet("TesterRegistration").getRow(1).getCell(5).getNumericCellValue();
		String PhNumber = String.valueOf(PhN);
		System.out.println("Phone Number is- "+PhNumber);	
		
		//fetching data for Password				
		FileInputStream ps= new FileInputStream("C:\\Users\\admin\\Desktop\\Rediff Data.xlsx");
		String Password = WorkbookFactory.create(ps).getSheet("TesterRegistration").getRow(1).getCell(3).getStringCellValue();
		System.out.println("Password is- "+Password);
		
		
			WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		// FirstName
		driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys(FirstName);
		// LastName
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(LastName);
		// Address
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys(Address);
		//Email
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email);
		//PhoneNumber
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys(PhNumber);
		//Radio Button Click
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).click();
		//click on CheckBox
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		// Click on language
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		//click on english language
		driver.findElement(By.xpath("//div[@style=\"display: block;\"]//li[8]")).click();
		
		// Click on an element outside the dropdown to close the list
		WebElement outsideElement = driver.findElement(By.xpath("//body")); // Or any other specific element
		outsideElement.click();

		//select from the list
		WebElement opt = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s= new Select(opt);
		s.selectByVisibleText("Backup Management");
		Thread.sleep(2000);
		
		// select Counrty from the list
		WebElement cntr = driver.findElement(By.xpath("(//select[@type=\"text\"])[2]"));
		Select counrty = new Select(cntr);
		counrty.selectByVisibleText("Select Country");
		
		// to click on India 
		driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")).click();
		driver.findElement(By.xpath("//ul[@id=\"select2-country-results\"]//li[6]")).click();
		
		// select year box
		WebElement yr = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select year = new Select(yr);
		year.selectByVisibleText("1996");
		
		//select month box
		WebElement mnth = driver.findElement(By.xpath("//select[@ng-model=\"monthbox\"]"));
		Select month = new Select(mnth);
		month.selectByVisibleText("June");
		
		//select day box
		WebElement d = driver.findElement(By.xpath("//select[@ng-model=\"daybox\"]"));
		Select day = new Select(d);
		day.selectByVisibleText("23");
			
		// scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000);");
		
		// Password 
		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys(Password);
		
		// Confirm Password 
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys(Password);
		
		// taking the screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\admin\\Desktop\\Music\\Screenshottesting.jpg");
		FileUtils.copyFile(src, dest);
		
	
		//click on Refresh button by using Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));			
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Button1"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navbar-collapse collapse navbar-right\"]//li[4]")).click();
		driver.findElement(By.xpath("//a[text()=\"Alerts\"]")).click();
		
		// click to for alert pop-up
		driver.findElement(By.xpath("//button[@onclick=\"alertbox()\"]")).click();
		// switching webdriver focus to alert
		Alert al = driver.switchTo().alert();
		System.out.println("The Alert Test is -> "+al.getText());
		al.accept();
		
		driver.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
	// switching to another alert	
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.dismiss();
		
	//click on the Practice site
		driver.findElement(By.xpath("//a[text()=\"Practice Site\"]")).click();
		
	//click on shop
		driver.findElement(By.xpath("//ul[@class=\"main-nav\"]//li[2]")).click();
		
	// to do registration and fill email
		driver.findElement(By.name("email")).sendKeys(email);
	// to fill password	
		driver.findElement(By.xpath("//input[@id=\"reg_password\"]")).sendKeys(Password);
		
	// click on the Register button
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
	// navigating back to main
		driver.navigate().back();
		
	// click on the shop
		driver.findElement(By.xpath("//a[text()=\"Shop\"]")).click();
		
		
		
	}
}
