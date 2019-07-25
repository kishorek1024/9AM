package nineam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertsss {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		// Clicking on Go Button
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		
		Thread.sleep(10000);
		a.dismiss();
		
	}

}
