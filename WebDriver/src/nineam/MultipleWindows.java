package nineam;

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
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Clicking On Data Policy Link
		driver.findElement(By.id("privacy-link")).click();
		// Clicking On Cookie Policy Link
		driver.findElement(By.id("cookie-use-link")).click();
		
		//driver.quit();
		
		Set<String> a=driver.getWindowHandles();
		ArrayList windows=new ArrayList(a);
		
		ArrayList aa=new ArrayList(driver.getWindowHandles());
		
		
		
		int i;
		for(i=0; i<windows.size(); i++){
			System.out.println(driver.switchTo().window((String) windows.get(i)).getTitle());
            List<WebElement> links=driver.switchTo().window((String) windows.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());			
			driver.switchTo().window((String)windows.get(i)).close();	}
		
		WebDriver driver1=driver.switchTo().window((String) windows.get(0));
		driver1.getTitle();
		
		
		

	}

}
