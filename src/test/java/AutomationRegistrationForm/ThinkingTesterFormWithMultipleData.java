package AutomationRegistrationForm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThinkingTesterFormWithMultipleData {
	
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\VerveSquareTesting1\\src\\test\\java\\AutomationRegistrationForm\\Rediff Data.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("TesterRegistration");
			int rowcount= sheet.getLastRowNum();   // to find how many rows are present
			int cellcount= sheet.getRow(1).getLastCellNum();  
			System.out.println("row count: "+rowcount+ " column count:"+cellcount);
			
			for(int i=1;i<=rowcount;i++) 
			{
				XSSFRow celldata = sheet.getRow(i);
				String FirstName = celldata.getCell(0).getStringCellValue();
				String Lastname = celldata.getCell(1).getStringCellValue();
				String Email = celldata.getCell(2).getStringCellValue();
				String Password = celldata.getCell(3).getStringCellValue();
				
				
				driver.findElement(By.id("firstName")).clear();
				driver.findElement(By.id("firstName")).sendKeys(FirstName);
				
				driver.findElement(By.id("lastName")).clear();
				driver.findElement(By.id("lastName")).sendKeys(Lastname);
				
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys(Email);
				
				driver.findElement(By.id("password")).clear();
				driver.findElement(By.id("password")).sendKeys(Password);
				
				System.out.println(i +"."+ FirstName+ " || "+ Lastname +" || "+ Email+ " || "+ Password );
				
				
			}
			
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	


	
	
	
}
