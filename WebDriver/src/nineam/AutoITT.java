package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		// Clicking On Upload Image
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/Zfb/img/add_files_ico.png']")).click();
		// Calling and Executing AutoIT exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\9WD\\0711.exe");
		
		

	}

}
