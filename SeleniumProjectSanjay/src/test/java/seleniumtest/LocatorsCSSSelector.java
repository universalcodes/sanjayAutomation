package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsCSSSelector {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Locator is used to find different web elements in the webpages");

		System.out.println(
				"There are 8 types of Locator\n classname\n id\n linktext\n PartialLinkText\n Xpath\n Tagname\n cssselector\nname\n");

		
		System.out.println("There are 5 types of CSS Selectors in Selenium tests-\r\n"
				+ "\r\n"
				+ "ID\r\n"
				+ "Class\r\n"
				+ "Attribute\r\n"
				+ "Sub-String\r\n"
				+ "Inner String\r\n"
				+ "");
		 
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		/*
		 * WebElement we = driver.findElement(By.cssSelector(
		 * "img[src='https://images-eu.ssl-images-amazon.com/images/G/31/img20/Jup21/P1/SWM1._CB640760428_.jpg']"
		 * ));
		 */		
		WebElement we = driver.findElement(By.cssSelector("img[src='https://images-eu.ssl-images-amazon.com/images/G/31/img20/Events/JupiterT1/PC_CC_crazy_offers_1x._SY304_CB639963194_.jpg']"));
		we.click();

	
	}
	
}