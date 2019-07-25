package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getWindowHandle());		
		// Clicking On Data Policy Link
		driver.findElement(By.id("privacy-link")).click();
		// Clicking On Cookie Policy Link
		driver.findElement(By.id("cookie-use-link")).click();		
		// Counting Number Of Windows
		Set<String> a=driver.getWindowHandles();
		// Arranging window ids in sequencial order
		ArrayList windows=new ArrayList(a);
		//System.out.println(windows.size());		
		driver.switchTo().window((String)windows.get(0)).findElement(By.id("email")).sendKeys("Kishore");
		driver.switchTo().window((String)windows.get(1)).findElement(By.id("pass")).sendKeys("sdfsdf");
		//Creating webdriver reference for windows
		WebDriver driver1=driver.switchTo().window((String)windows.get(0));
		driver1.findElement(By.id("email")).sendKeys("fdghj");
		WebDriver driver2=driver.switchTo().window((String)windows.get(1));		
		/*int i;
		for(i=0; i<windows.size(); i++){
		// Switching to windows
			System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle());
			List<WebElement> links=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().window((String)windows.get(i)).close();			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				

	}

}
