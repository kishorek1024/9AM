package packone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		// Counting Number Of Frames
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		int i; int j;
		
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
				System.out.println("-------------------------------------------------------");
			}
			
			driver.switchTo().parentFrame();
		}
		
		
		
		
		
		
		
		
		
				
		
		/*// Creating Webelement for Frame1
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		// Switch to Frame and clicking On Link
		driver.switchTo().frame(f1).findElement(By.xpath("//a[@href='java/applet/package-frame.html']")).click();

		// Navigating focus to Frameset
		driver.switchTo().parentFrame();
		
		// Creating Webelemnt for Frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		
		// Switching to Frame2 and CLicking on Link
		driver.switchTo().frame(f2).findElement(By.xpath("//a[@href='AppletStub.html']")).click();*/
		
	}

}
