package abc_practices;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {
	public static void main(String[] args) throws Throwable {
	       
	    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();  // You can use any other web browser.
	        driver.get("https://www.google.com/");
	        System.out.println(driver.getTitle());
	        driver.findElement(By.id("gb_70")).click();

	        driver.get("https://accounts.google.com/ServiceLogin?");
	        driver.findElement(By.id("identifierId")).sendKeys("mdfasial.hossain1992@gmail.com");
	        driver.findElement(By.id("identifierNext")).click();
	        driver.findElement(By.xpath("//input[@aria-label='Enter your password' and @name='password']")).sendKeys("JLKSFJASL");
	        Thread.sleep(200);
	        driver.findElement(By.id("passwordNext")).click();
	        
	        Thread.sleep(2000);
	       

	        driver.get("https://www.facebook.com/");
	        Thread.sleep(5000);
	        driver.navigate().back();
	       
	        Thread.sleep(5000);
	        
	        driver.close();
	        
	        
	    }

}
