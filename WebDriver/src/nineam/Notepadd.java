package nineam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Notepadd {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\9WD\\Output.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi How are You");
		bw.close();
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\9WD\\1234.txt");
		BufferedReader b=new BufferedReader(f);
		
		String val=b.readLine();
		
		String[] a=val.split(" ");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(a[0]);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(a[1]);
		driver.findElement(By.id("pass")).sendKeys(a[2]);*/
		
		
		/*
		String s;
		
		while((s=b.readLine())!=null){
			if(s.endsWith("r")==true)
				System.out.println(s);
		}*/
		
		
	}

}
