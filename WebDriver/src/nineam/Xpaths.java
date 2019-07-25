package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("html/body/div/div/div[2]/div[2]/div/div/form/div/div[2]/input")).sendKeys("Kishore");
		driver.findElement(By.xpath("html/body/div/div/div[2]/div[2]/div/div/form/div/div[4]/input")).sendKeys("Kishore");

	}

}
