package AutoConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IgenAutomation {
	
	public static void main(String[] args) throws InterruptedException, AWTException {

	        
		 ChromeOptions options = new ChromeOptions();
	        options.setAcceptInsecureCerts(true);  // Accept self-signed SSL
	        WebDriver driver = new ChromeDriver(options);

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        driver.get("https://13.127.18.91:44335");
	        driver.manage().window().maximize();

	        System.out.println("Page Title: " + driver.getTitle());

	        // login
	        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("8012072269");
	        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("inube@123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();

	        // search claim
	        driver.findElement(By.id("txtClaimNoSearch")).sendKeys("CL25000192");
	        driver.findElement(By.id("btnSearchClaimDetails")).click();

	        // wait for loader to disappear before clicking claim link
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("LoadingImage")));
	        WebElement claimLink1 = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='CL25000192']")));
	        claimLink1.click();

	        // wait again and click second time
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("LoadingImage")));
	        WebElement claimLink2 = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='CL25000192']")));
	        claimLink2.click();

	        // open update insured contact details tab
	        WebElement contactTab = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='tabclaims']//li[3]")));
	        contactTab.click();

	        // enter email and save
	        driver.findElement(By.id("EmailID"))
	              .sendKeys("shaikh.juned@inubesolutions.com");
	        driver.findElement(By.xpath("//input[@value='Save']")).click();

	        // open next tab
	        WebElement docTab = wait.until(
	                ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='tabclaims']//li[4]")));
	        docTab.click();

	        								// upload Address proof file
//	        WebElement address = wait.until(
//	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_136']")));        
//	        Actions act = new Actions(driver);
//	        act.moveToElement(address).click().perform();
//	        Robot rb = new Robot();							//using robot class for uploading
//	        rb.delay(2000);
//	        						// copy file path to clipboard
//	        StringSelection ss = new StringSelection("C:\\Users\\admin\\Downloads\\addressproof.jpg");
//	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	        						// paste (Ctrl + V)
//	        rb.keyPress(KeyEvent.VK_CONTROL);s
//	        rb.keyPress(KeyEvent.VK_V);
//	        rb.keyRelease(KeyEvent.VK_CONTROL);
//	        rb.keyRelease(KeyEvent.VK_V);
//	        // press Enter
//	        rb.keyPress(KeyEvent.VK_ENTER);
//	        rb.keyRelease(KeyEvent.VK_ENTER);
//	        Thread.sleep(2000);
	//        driver.findElement(By.xpath("//input[@id=\"btnuploadDoc\"]")).click();
	        
	//=============   
	    
	                 
	     // Wait for the second upload label and click it uploading claim form
	      
	        WebElement address1 = wait.until(
	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_167']")));
	        // using Action Class
	        Actions act1 = new Actions(driver);
	        act1.moveToElement(address1).click().perform();
	        Robot rb1 = new Robot();									//using robot class for uploading
	        rb1.delay(2000); 
	        
	        									// copy file path to clipboard  
	        StringSelection ss1 = new StringSelection("C:\\Users\\admin\\Downloads\\ClaimForm.jpg");
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss1, null);
	        									// paste (Ctrl + V)
	        rb1.keyPress(KeyEvent.VK_CONTROL);
	        rb1.keyPress(KeyEvent.VK_V);
	        rb1.keyRelease(KeyEvent.VK_CONTROL);
	        rb1.keyRelease(KeyEvent.VK_V);
	        // press Enter
	        rb1.keyPress(KeyEvent.VK_ENTER);
	        rb1.keyRelease(KeyEvent.VK_ENTER);
	        
	        Thread.sleep(2000);
	        
	        
	  // =================================================================
	        
	   //     Uploading DL        
	        WebElement address2 = wait.until(
	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_169']")));
	    	        // using Action Class
	    	        Actions act2 = new Actions(driver);
	    	        act2.moveToElement(address2).click().perform();
	    	        Robot rb2 = new Robot();									//using robot class for uploading
	    	        rb2.delay(2000); 
	    	        
	    	        									// copy file path to clipboard  
	    	        StringSelection ss2 = new StringSelection("C:\\Users\\admin\\Downloads\\drivingLicense.jpg");
	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
	    	        									// paste (Ctrl + V)
	    	        rb2.keyPress(KeyEvent.VK_CONTROL);
	    	        rb2.keyPress(KeyEvent.VK_V);
	    	        rb2.keyRelease(KeyEvent.VK_CONTROL);
	    	        rb2.keyRelease(KeyEvent.VK_V);
	    	        // press Enter
	    	        rb2.keyPress(KeyEvent.VK_ENTER);
	    	        rb2.keyRelease(KeyEvent.VK_ENTER);
	    	        Thread.sleep(2000);
		
		//  Uploading Estimate
	    	        WebElement address3 = wait.until(
	    	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_171']")));
	    	    	        // using Action Class
	    	    	        Actions act3 = new Actions(driver);
	    	    	        act3.moveToElement(address3).click().perform();
	    	    	        Robot rb3 = new Robot();									//using robot class for uploading
	    	    	        rb3.delay(2000); 
	    	    	        
	    	    	        									// copy file path to clipboard  
	    	    	        StringSelection ss3 = new StringSelection("C:\\Users\\admin\\Downloads\\Estimate.PNG");
	    	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss3, null);
	    	    	        									// paste (Ctrl + V)
	    	    	        rb3.keyPress(KeyEvent.VK_CONTROL);
	    	    	        rb3.keyPress(KeyEvent.VK_V);
	    	    	        rb3.keyRelease(KeyEvent.VK_CONTROL);
	    	    	        rb3.keyRelease(KeyEvent.VK_V);
	    	    	        // press Enter
	    	    	        rb3.keyPress(KeyEvent.VK_ENTER);
	    	    	        rb3.keyRelease(KeyEvent.VK_ENTER);
	    	    	        Thread.sleep(2000);
	
	    	    	        // uploading Identity proof	    	    	 
	    	    	        WebElement address4 = wait.until(
	    	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_137']")));
	    	    	    	        // using Action Class
	    	    	        Actions act4 = new Actions(driver);
	    	    	        act4.moveToElement(address4).click().perform();
	    	    	        Robot rb4 = new Robot();									//using robot class for uploading
	    	    	        rb4.delay(2000); 
	    	    	    	        
	    	    	    	        									// copy file path to clipboard  
	    	    	        StringSelection ss4 = new StringSelection("C:\\Users\\admin\\Downloads\\identityProof.jpg");
	    	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss4, null);
	    	    	    	        									// paste (Ctrl + V)
	    	    	        rb4.keyPress(KeyEvent.VK_CONTROL);
	    	    	        rb4.keyPress(KeyEvent.VK_V);
	    	    	        rb4.keyRelease(KeyEvent.VK_CONTROL);
	    	    	        rb4.keyRelease(KeyEvent.VK_V);
	    	    	    	        // press Enter
	    	    	        rb4.keyPress(KeyEvent.VK_ENTER);
	    	    	        rb4.keyRelease(KeyEvent.VK_ENTER);
	    	    	        Thread.sleep(2000);

      // Uploading Insurance Policy
	    	    	        WebElement address5 = wait.until(
	    	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_170']")));
	    	    	    	    	        // using Action Class
	    	    	        Actions act5 = new Actions(driver);
	    	    	        act5.moveToElement(address5).click().perform();
	    	    	        Robot rb5 = new Robot();									//using robot class for uploading
	    	    	        rb5.delay(2000); 
	    	    	    	    	        
	    	    	    	    	        									// copy file path to clipboard  
	    	    	        StringSelection ss5 = new StringSelection("C:\\Users\\admin\\Downloads\\InsurancePolicy.png");
	    	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss5, null);
	    	    	    	    	        									// paste (Ctrl + V)
	    	    	        rb5.keyPress(KeyEvent.VK_CONTROL);
	    	    	        rb5.keyPress(KeyEvent.VK_V);
	    	    	        rb5.keyRelease(KeyEvent.VK_CONTROL);
	    	    	        rb5.keyRelease(KeyEvent.VK_V);
	    	    	    	    	        // press Enter
	    	    	        rb5.keyPress(KeyEvent.VK_ENTER);
	    	    	        rb5.keyRelease(KeyEvent.VK_ENTER);
	    	    	        Thread.sleep(2000);     
	    	    	        
	    	    	        
     // Uploading  Odo Meter
	    	    	        WebElement address6 = wait.until(
	    	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_232']")));
	    	    	    	    	        // using Action Class
	    	    	        Actions act6 = new Actions(driver);
	    	    	        act6.moveToElement(address6).click().perform();
	    	    	        Robot rb6 = new Robot();									//using robot class for uploading
	    	    	        rb6.delay(2000); 
	    	    	    	    	        
	    	    	    	    	        									// copy file path to clipboard  
	    	    	        StringSelection ss6 = new StringSelection("C:\\Users\\admin\\Downloads\\OdoMeter.jpg");
	    	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss6, null);
	    	    	    	    	        									// paste (Ctrl + V)
	    	    	        rb6.keyPress(KeyEvent.VK_CONTROL);
	    	    	        rb6.keyPress(KeyEvent.VK_V);
	    	    	        rb6.keyRelease(KeyEvent.VK_CONTROL);
	    	    	        rb6.keyRelease(KeyEvent.VK_V);
	    	    	    	    	        // press Enter
	    	    	        rb6.keyPress(KeyEvent.VK_ENTER);
	    	    	        rb6.keyRelease(KeyEvent.VK_ENTER);
	    	    	        Thread.sleep(2000);    	        
	    	    	        
	    	    	        
           // Uploading RC 
	     	    	        WebElement address7 = wait.until(
	    	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_168']")));
	    	    	    	    	        // using Action Class
	    	    	        Actions act7 = new Actions(driver);
	    	    	        act7.moveToElement(address7).click().perform();
	    	    	        Robot rb7 = new Robot();									//using robot class for uploading
	    	    	        rb7.delay(2000); 
	    	    	    	    	        
	    	    	    	    	        									// copy file path to clipboard  
	    	    	        StringSelection ss7 = new StringSelection("C:\\Users\\admin\\Downloads\\rc.jpg");
	    	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss7, null);
	    	    	    	    	        									// paste (Ctrl + V)
	    	    	        rb7.keyPress(KeyEvent.VK_CONTROL);
	    	    	        rb7.keyPress(KeyEvent.VK_V);
	    	    	        rb7.keyRelease(KeyEvent.VK_CONTROL);
	    	    	        rb7.keyRelease(KeyEvent.VK_V);
	    	    	    	    	        // press Enter
	    	    	        rb7.keyPress(KeyEvent.VK_ENTER);
	    	    	        rb7.keyRelease(KeyEvent.VK_ENTER);
	    	    	        Thread.sleep(2000);    	        
	    	    	        
	    	    	        
          // Uploading Repair Bill
	     	    	        WebElement address8 = wait.until(
	    	    	        ExpectedConditions.elementToBeClickable(By.xpath("//label[@id='PreinspectionDoc_172']")));
	    	    	    	    	        // using Action Class
	    	    	        Actions act8 = new Actions(driver);
	    	    	        act8.moveToElement(address8).click().perform();
	    	    	        Robot rb8 = new Robot();									//using robot class for uploading
	    	    	        rb8.delay(2000); 
	    	    	    	    	        
	    	    	    	    	        									// copy file path to clipboard  
	    	    	        StringSelection ss8 = new StringSelection("C:\\Users\\admin\\Downloads\\RepairBill.png");
	    	    	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss8, null);
	    	    	    	    	        									// paste (Ctrl + V)
	    	    	        rb8.keyPress(KeyEvent.VK_CONTROL);
	    	    	        rb8.keyPress(KeyEvent.VK_V);
	    	    	        rb8.keyRelease(KeyEvent.VK_CONTROL);
	    	    	        rb8.keyRelease(KeyEvent.VK_V);
	    	    	    	    	        // press Enter
	    	    	        rb8.keyPress(KeyEvent.VK_ENTER);
	    	    	        rb8.keyRelease(KeyEvent.VK_ENTER);
	    	    	        Thread.sleep(2000);     	        
	    	    	        
	    	    	        
	    	    	        

}
}