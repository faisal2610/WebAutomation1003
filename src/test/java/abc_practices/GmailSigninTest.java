package abc_practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {
	public static void main(String[] args) throws Throwable {
	       
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mdfai\\utilities\\drivers\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();  // You can use any other web browser.
	        driver.get("https://www.google.com/");
	        System.out.println(driver.getTitle());
	    
	        driver.get("https://www.facebook.com/");
	        Thread.sleep(500);
	        driver.navigate().back();
	       
	        Thread.sleep(500);
	        
	        driver.close();
	        
	        
	    }

	}
