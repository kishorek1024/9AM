package nineam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		PageObjects p=PageFactory.initElements(driver, PageObjects.class);
		p.uid.sendKeys("Kishore");
		p.pwd.sendKeys("asbshjdf");
		
		PageObjects1 p1=PageFactory.initElements(driver, PageObjects1.class);
		p1.fullname.sendKeys("dsfsdfs");
		
		
		
		
		
		/*PageObjects p=new PageObjects();
		driver.findElement(p.uid).sendKeys("Kishore");
		driver.findElement(p.pwd).sendKeys("abcdef");*/
		

	}

}
