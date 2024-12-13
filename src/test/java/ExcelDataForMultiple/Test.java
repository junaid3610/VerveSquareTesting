package ExcelDataForMultiple;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
		WebElement ctr = driver.findElement(By.xpath("//select[@id=\"countries\"]"));
		driver.switchTo().frame(0);
		Select Counrty= new Select(ctr);
		Counrty.selectByVisibleText("India");
		
		
		
	}
}
