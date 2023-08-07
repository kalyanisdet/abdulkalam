package practice;



import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice20 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.switchTo().activeElement().sendKeys("mindqkalyani123",Keys.ENTER);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(5000);
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		Thread.sleep(5000);
		driver.navigate().back();
		
			}

}
