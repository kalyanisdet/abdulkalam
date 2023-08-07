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

public class FramesPractice22 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://app.fastmail.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("kalyanimindq123", Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Compose']/ancestor::a[@id='v158']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@class='v-EmailInput-input'])[1]")).sendKeys("mindqkalyani123@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Testing doc");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Body']")).sendKeys("Hi  \n, I am s/w test engineer");
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[contains(@class,'v-Button v-MenuButton v-Button--standard')])[2]/parent::div")).click();
		
		driver.findElement(By.xpath("//span[text()='Upload files']")).click();
		
		//(//button[contains(@class,'v-Button v-MenuButton v-Button--standard')])[2]/parent::div
		
		//sendKeys("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\newrelease.png");
		}
			}


