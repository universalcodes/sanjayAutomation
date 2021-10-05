package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URLTesting {
	
	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();  // default code
		
		WebDriver browserdriver = new ChromeDriver();
		
		browserdriver.manage().deleteAllCookies();
		
		browserdriver.manage().window().maximize();
		
		//or
		
		String a = "https://en.wikipedia.org/wiki/Aalaap_(film)";
		
		browserdriver.get(a);
		
		
System.out.println(	browserdriver.getCurrentUrl());		
		
System.out.println(	browserdriver.getTitle());		

System.out.println(	browserdriver.getPageSource());		



		System.out.println();
		
		
	
		Thread.sleep(10000);
		
		System.out.println("Running Thread Sleep");
		
		WebDriverWait  waidt = new WebDriverWait(browserdriver, 20 );
		
		System.out.println("WebDriverwait");

		
		browserdriver.navigate().refresh();
		
		System.out.println("Page Refresh or not");
		
	

		
		browserdriver.navigate().to("https://en.wikipedia.org/wiki/Bollywood");
		
		
		  waidt = new WebDriverWait(browserdriver, 10 );



		System.out.println("DFGs");
		
		
		Thread.sleep(10000);
		

		browserdriver.navigate().back();
		
		Thread.sleep(10000);


		browserdriver.navigate().forward();
		
		Thread.sleep(10000);
		
		
		browserdriver.navigate().refresh();



		
		
	//	browserdriver.manage().window().fullscreen();


		
		
		
		
		
	//	browserdriver.quit();
		
	}

}
