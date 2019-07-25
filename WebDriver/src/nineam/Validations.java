package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Kishore");
		WebElement pwd=driver.findElement(By.id("pass"));
		
		String a=pwd.getAttribute("class");
		System.out.println(a);
		System.out.println(pwd.getTagName());
		System.out.println(pwd.getSize());
		System.out.println(pwd.getLocation());
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
		System.out.println(driver.getWindowHandle());
		
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		//driver.manage().window().setSize("arg0");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("");
		
		
		
		/*boolean a=pwd.isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=pwd.isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		

	}

}
