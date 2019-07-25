package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Methods {
	
	public WebDriver driver;
	
	public void launchApp(String url){
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void closeApp(){
		driver.close();
	}
	public void elementPresent(String loc, boolean exp){
		boolean a=driver.findElement(By.id(loc)).isDisplayed();
		if(a==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	
	
}
