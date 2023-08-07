package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test21 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		//Inside frame1:  Attribute is:name, Value is: fname                
		driver.findElement(By.name("fname")).clear();
		driver.findElement(By.name("fname")).sendKeys("Rey");
		driver.findElement(By.name("fname")).clear();
		driver.findElement(By.name("fname")).sendKeys("Hey");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().defaultContent();
		
		
	}

}
