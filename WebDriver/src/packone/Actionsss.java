package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		/*WebElement login=driver.findElement(By.id("Login"));
		// Applying Double click on Login
		a.doubleClick(login).build().perform();*/
		
		// Creating Webelement for Email
		WebElement email=driver.findElement(By.id("email"));
		// Right clicking on Email
		a.contextClick(email).build().perform();
		
		// Godown in Menu for 4 times
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		// Applying DragandDrop
		a.dragAndDrop(email, email).build().perform();
		
		// Aplying Clickand Hold
		a.clickAndHold(email).build().perform();
		Thread.sleep(10000);
		a.release().build().perform();
		
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();*/
		
		
		/*// Creating Webelement for Companies
		WebElement comp=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		//Importing Actions
		Actions a=new Actions(driver);
		
		// Move cursor to COmpanies
		a.moveToElement(comp).build().perform();
		
		// Clicking on About companies
		//driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();
		
		// Create Webelement for Menu
		WebElement menu=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul"));
		
		
		List<WebElement> links=menu.findElements(By.tagName("a"));
		System.out.println(links.size());*/
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
