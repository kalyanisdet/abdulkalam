package practice;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice18 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.xpath("(//span[text()='Login']/preceding::button)[2]"));
		Thread.sleep(5000);
		try {
			e.click();
		}
		catch(Exception e1) {
			driver.executeScript("arguments[0].click();", e1);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Best of Women Trimmers']")).click();
	
		
		Thread.sleep(5000);
		
		  List<WebElement> list=driver.findElements(By.xpath("//div[@class='_13oc-S']/descendant::a")); 
		  for(int i=0;i<list.size();i++) 
		  { list.get(i).click(); Thread.sleep(5000); Set<String>
		  s=driver.getWindowHandles(); List<String> l=new ArrayList<String>(s);
		  driver.switchTo().window(l.get(1)); Thread.sleep(5000);
		  WebElement eachEle=driver.findElement(By.xpath("//span[@class='B_NuCI']")); 
		  String x=eachEle.getText(); System.out.println(x);
		  
		  Thread.sleep(5000); 
		  driver.switchTo().window(l.get(0));
		  
		  
		  }
		 
		
		
			}

}
