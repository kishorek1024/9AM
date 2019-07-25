package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {
	
	public static WebElement companies;

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/*// Creating Webelement for Companies
		companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		// Importing Actions Class
*/		
		/*// Moving Cursor to Companies Element
		a.moveToElement(companies).build().perform();
		
		// Clicking on About Companies Link
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/
		
		
		Actions a=new Actions(driver);
		
		WebElement email=driver.findElement(By.id("email"));
		
		a.contextClick(email).build().perform();
		
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		a.dragAndDrop(email, email).build().perform();
		
		
		
		/*WebElement login=driver.findElement(By.id("Login"));
		
		a.doubleClick(login).build().perform();
		*/
		
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
