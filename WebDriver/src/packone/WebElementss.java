package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementss {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("email")).sendKeys("Kishore");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("ayxdfvsd");
		driver.findElement(By.id("email")).clear();*/
		
		// Creating Reference using Webelement
		WebElement uid=driver.findElement(By.id("email"));
		uid.sendKeys("Kishore");
		uid.clear();
		uid.sendKeys("dsfsdfsdfsd");
		
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("sdfsdf");
		

	}

}
