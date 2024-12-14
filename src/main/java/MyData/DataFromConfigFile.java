package MyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromConfigFile {
	
	public static void main(String[] args) throws IOException {
		
		// to access the config File
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\VerveSquareTesting1\\src\\main\\java\\MyData\\Data.properties");
		Properties p = new Properties();
		// to load thi file
		p.load(fis);          
		String Mybrowser = p.getProperty("browser");
		String Myurl = p.getProperty("url");
	
		WebDriver driver = new ChromeDriver();
		driver.get(Myurl);
		
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
		
		
		
		
	}
	
	
	
	

}
