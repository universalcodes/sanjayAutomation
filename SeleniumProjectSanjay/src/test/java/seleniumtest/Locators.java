package seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Locator is used to find different web elements in the webpages");

		System.out.println(
				"There are 8 types of Locator\n classname\n id\n linktext\n PartialLinkText\n Xpath\n Tagname\n cssselector\nname\n");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		
		
		WebDriverWait waitingtime = new WebDriverWait(driver, 10);
		
		
		System.out.println("Sysout works here");
	
		 WebElement locactors = driver.findElement(By.id("identifierId"));
		  locactors.click();
		 
		 System.out.println("id is correct");
		 
	
		 locactors = driver.findElement(By.name("identifier")); locactors.click();
		 System.out.println("name is correct");
		 
			
		
			try {
				
				
				 locactors = driver.findElement(By.className("whsOnd zHQkBf"));
				 
				 
				 locactors.click();
				 
			}
			
			catch (NoSuchElementException e) {
				System.out.println("Exception handled ");
			}
			
			
			/*
			 * locactors = driver.findElement(By.tagName("input")); locactors.click();
			 */
			
			try {
				
			 locactors = driver.findElement(By.tagName("a")); locactors.click();
			 locactors = driver.findElement(By.linkText("Learn more"));  
				locactors.click();
				
			}
			
			catch (NoSuchElementException e) {
				
				System.out.println("LearN More is clicked Morre");

			}
		 
			
			
			
			
			driver.navigate().back();
			
			
			
			
			
			/*
			 * locactors = driver.findElement(By.partialLinkText("Pri")); locactors.click();
			 */
			
			/*
			 * locactors = driver.findElement(By.tagName("Learn More")); locactors.click();
			 */
			
		
			
			
			
			


			
			
		
			/*
			 * WebElement locators = driver.findElement(By.partialLinkText("email"));
			 * locators.click();
			 */
		 
		 
		 
		 


		
		 
		 
		 
		
	}

}
