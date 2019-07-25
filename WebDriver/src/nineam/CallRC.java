package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class CallRC {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://bharatmatrimony.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ID")).sendKeys("abcdef");
		WebDriverBackedSelenium s=new WebDriverBackedSelenium(driver, "http://");
		s.select("id=REGISTERED_BY", "Friend");
		s.type("id=NAME", "Kishore");
		driver.findElement(By.id("DOBDAY")).sendKeys("24");

	}

}
