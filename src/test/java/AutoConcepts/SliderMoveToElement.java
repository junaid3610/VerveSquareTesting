package AutoConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderMoveToElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		// to access the config File
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\eclipse-workspace\\VerveSquareTesting1\\src\\test\\java\\AutoConcepts\\TestingDataForPractice");
		Properties p = new Properties();
// to load thi file
		p.load(fis);
		p.getProperty("browser");
		String URL = p.getProperty("url");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("// ul[@class=\"nav navbar-nav\"]//li[5]")).click();
		driver.findElement(By.xpath("//a[text()=\" Slider \"]")).click();
		
		WebElement Drag = driver.findElement(By.xpath("//div[@id=\"slider\"]"));
		//dragging by actions class methods	
			Actions act = new Actions(driver);
			act.dragAndDropBy(Drag, 0, 200).perform();
			act.click().perform();
			
// Click on an element outside the dropdown to close the list
			WebElement outsideElement = driver.findElement(By.xpath("//body")); // Or any other specific element
			outsideElement.click();
			
// Hovering on element		
			List<WebElement> Links = driver.findElements(By.xpath("//ul[@class=\"nav navbar-nav\"]//li"));
			for(int i=0;i<Links.size();i++) {
				WebElement link = Links.get(i);
				Actions action = new Actions(driver);
				action.moveToElement(link);
				action.perform();
				System.out.println(link.getAttribute("href"));// to print links
//				Thread.sleep(1000);
				
				
				
				
			}
	
	}

}
