package testng9;

import java.util.concurrent.TimeUnit;

import nineam.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
	
	public WebDriver driver;
	
	@DataProvider(name="TestData")
	public Object[][] data(){
		Object[][] obj=new Object[3][3];
		obj[0][0]="Kishore"; obj[0][1]="abcdefgh";  obj[0][2]="24";
		obj[1][0]="Qshore"; obj[1][1]="Kishore"; obj[1][2]="11";
		obj[2][0]="KishoreKumar"; obj[2][1]="Qshore"; obj[2][2]="6";
		return obj;
	}
	  @Test(dataProvider="TestData")
	  public void f(String uid, String pwd, String day) {
		  PageObjects p=PageFactory.initElements(driver, PageObjects.class);
		  p.uid.sendKeys(uid);
		  driver.findElement(By.id("email")).sendKeys(uid);
		  driver.findElement(By.id("pass")).sendKeys(pwd);
		  driver.findElement(By.id("day")).sendKeys(day);
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  driver=new FirefoxDriver();
		  driver.get("http://facebook.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }


}
