package nineam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	/*By uid=By.id("login1");
	By pwd=By.id("password");*/
	
	public @FindBy(id="login1") WebElement uid;
	public @FindBy(id="password") WebElement pwd;
	
	
	
	

}
