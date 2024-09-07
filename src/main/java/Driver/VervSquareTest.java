package Driver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VervSquareTest {
	
	 WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        // Set the correct path to ChromeDriver
	    	WebDriver driver = new ChromeDriver();
	        driver = new ChromeDriver();  // Initialize WebDriver
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Implicit wait
	        driver.get("https://www.myntra.com");  // Open the website
	        driver.manage().window().maximize();  // Maximize the window
	    }

	    @Test
	    public void verifyPhoneCase() throws InterruptedException {
	        // Hover over "Men" tab
	        Actions actions = new Actions(driver);
	        WebElement menTab = driver.findElement(By.xpath("//a[@data-group='men']"));
	        actions.moveToElement(menTab).perform();  // Hover action

	        // Click on "Phone Cases" inside Fashion Accessories
	        WebElement phoneCases = driver.findElement(By.xpath("//a[text()='Phone Cases']"));
	        phoneCases.click();

	        // Wait for the items to load
	        Thread.sleep(3000);

	        // Find all products on the page
	        List<WebElement> phoneCasesItems = driver.findElements(By.cssSelector(".product-base"));

	        // Click on 3rd row, 3rd item (index 8, because 3rd row and 3rd column starts at index 0)
	        phoneCasesItems.get(8).click();

	        // Switch to the new tab or window
	        for (String windowHandle : driver.getWindowHandles()) {
	            driver.switchTo().window(windowHandle);
	        }

	        // Verify price is displayed and check if it's more than Rs. 10
	        WebElement priceElement = driver.findElement(By.xpath("//span[@class='pdp-price']"));
	        Assert.assertTrue(priceElement.isDisplayed(), "Price is not displayed");
	        String priceText = priceElement.getText().replace("Rs.", "").replace(",", "").trim();  // Clean up the price text
	        double price = Double.parseDouble(priceText);
	        Assert.assertTrue(price > 10, "Price is less than Rs. 10");

	        // Verify "ADD TO BAG" button is displayed
	        WebElement addToBagButton = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
	        Assert.assertTrue(addToBagButton.isDisplayed(), "ADD TO BAG button is not displayed");
	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	
	
	
	

}
