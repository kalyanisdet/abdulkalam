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

public class FramesPractice21 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		try
		{
			WebElement webEle=driver.findElement(By.xpath("//div[@id='container']/following::button[1]"));
			webEle.click();
		}
		catch(Exception e) {
			driver.executeScript("arguments[0].click();", e);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']")).click();
		
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Electronics']/following::a[@title='From ₹7949']")).click();
		Thread.sleep(5000);
		List<WebElement> allItems=driver.findElements(By.xpath("//div[text()='Free delivery']/preceding::div[@class='_30jeq3 _1_WHN1']"));
	Thread.sleep(5000);
		for(int i=0;i<=allItems.size();i++) {
			Thread.sleep(5000);
			allItems.get(i).click();
			Set<String> set=driver.getWindowHandles();
			List<String> list=new ArrayList<String>(set);
			driver.switchTo().window(list.get(1));
			Thread.sleep(5000);
			
			
			String string=driver.findElement(By.xpath("//div[@id='price-info-icon']/preceding::div[@class='_30jeq3 _16Jk6d']")).getText();
			string=string.substring(1);
			string=string.replace(",","");
			
			System.out.println(string);
			Thread.sleep(5000);
			driver.close();
			set=driver.getWindowHandles();
			list=new ArrayList<String>(set);
			driver.switchTo().window(list.get(0));
		}
			}

}
