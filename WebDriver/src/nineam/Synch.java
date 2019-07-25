package nineam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Clicking On Forgot Password Link
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")).click();
		
		// Importing WebdriverWait
		WebDriverWait ww=new WebDriverWait(driver, 30);
		// Stopping execution based on title
		ww.until(ExpectedConditions.titleContains("Forgotten"));
		ww.until(ExpectedConditions.urlContains("identify"));
		// Entering Value in Textbox
		driver.findElement(By.id("identify_email")).sendKeys("Kishore");
		
		
		

	}

}
