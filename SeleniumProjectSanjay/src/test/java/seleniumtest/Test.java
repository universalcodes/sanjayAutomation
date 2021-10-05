package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	public static void main(String[] args) { // main
		
		int a = 6;
		System.out.println(a);
		
		
		WebDriverManager.chromedriver().setup();  // default code
		
		WebDriver browserdriver = new ChromeDriver();
		
		browserdriver.quit();
		
		
		System.out.println();
		
		/*
		 * WebDriverManager.firefoxdriver().setup(); // default code
		 * 
		 * browserdriver = new FirefoxDriver();
		 * 
		 * browserdriver.quit();
		 */
		 
		
		
		
		WebDriverManager.edgedriver().setup();  // default code
		
		 browserdriver = new EdgeDriver();
			
			browserdriver.quit();
			
		WebDriverManager.iedriver().setup();  // default code
		

		 browserdriver = new InternetExplorerDriver();
			
			browserdriver.quit();
		
			
			
		
		
		
		
	}

}
