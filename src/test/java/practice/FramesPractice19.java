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

public class FramesPractice19 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-username")).sendKeys("mindqkalyani123@gmail.com",Keys.ENTER);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.id("ybar-navigation-item-mail")).click();
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//button[@aria-label='Close']/child::span")).click();
			
		}
		catch(Exception ex) { 
			System.out.println("Not displayed window");
		}
		
		driver.findElement(By.linkText("Compose")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[contains(@class,'select-input')])[2]")).sendKeys("kalyanimindq123@fastmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("Important stuff");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hello");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']/preceding::button[@aria-label='Attach files']")).sendKeys("C:\\Users\\arako\\OneDrive\\Pictures\\ScreenshotsNote3.png");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Send']")).click();
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//div[@role='presentation']/following::div[1]")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://app.fastmail.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("kalyanimindq123@fastmail.com",Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(5000);
		TakesScreenshot tScr=(TakesScreenshot)driver;
		File src=tScr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\fastemailMailConfirmation.png"));
		
		
		System.out.println("Screenshot has been taken successfully");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='main-nav-toolbar']/child::span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='s-nav-logout']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		Thread.sleep(5000); 
		  driver.findElement(By.id("ybarAccountMenuOpener")).click();
		  Thread.sleep(5000); 
		  driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		  
		
		
		
		
		
		
			}

}
