package practice;



import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice28 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fastmail.com/login/");
		Thread.sleep(5000);
		
		driver.switchTo().activeElement().sendKeys("kalyanimindq123", Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='v-PushSelect']/descendant::label[text()='Pinned']")).click();
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//ul[contains(@class,'Mailbox')]/descendant::li/child::a/following::button[@class='u-list-pin']"));
		Thread.sleep(5000);
		for(WebElement list:l) {
			list.click();
		}
	System.out.println("Pinned mails 'Unpinned' successfully.");	
		
		}
		
		}
	
		
			


