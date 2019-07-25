package nineam;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class ScreenShots {

	public static void main(String[] args) throws Exception {
		
		MethodsScreenshots m=new MethodsScreenshots();
		m.launchApp("http://facebook.com", "C:\\Users\\DELL\\Desktop\\9WD\\redifflaunch.png");
		m.elementPresent("email", true, "C:\\Users\\DELL\\Desktop\\9WD\\emailavailable.png");
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\DELL\\Desktop\\9WD\\fblaunch.png"));*/

	}

}
