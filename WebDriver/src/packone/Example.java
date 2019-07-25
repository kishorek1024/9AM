package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://online.citi.com/US/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).click();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Kishore");

	}

}
