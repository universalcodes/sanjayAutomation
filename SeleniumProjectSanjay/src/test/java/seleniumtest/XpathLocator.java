package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_AccountFlyout_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");

		Thread.sleep(5000);
		
		
		
		
		
		WebElement buttonclick = driver.findElement(By.name("email"));
		
		
		buttonclick.sendKeys(Keys.TAB);
		buttonclick.sendKeys(Keys.SHIFT, Keys.TAB);
		
		buttonclick.sendKeys("yogeshkamfs");
		
		Thread.sleep(5000);

		
		buttonclick.clear();
		
		Thread.sleep(5000);

		buttonclick.sendKeys("yogeshkamra25@gmail.com");
		Thread.sleep(5000);

		
		buttonclick = driver.findElement(By.id("continue"));
		
		Thread.sleep(5000);
		
		
		

		
		/*
		 * buttonclick.click();
		 * 
		 * String a = driver.getTitle(); System.out.println(a);
		 * 
		 * 
		 * a = driver.getCurrentUrl(); System.out.println(driver.getCurrentUrl());
		 * 
		 * 
		 */
		
		
		

	}
	
}
