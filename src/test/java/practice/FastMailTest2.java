package practice;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;
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

public class FastMailTest2 {

	
	@Test
	public void method() throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fastmail.com/login/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='v-TextInput-input']")).sendKeys("mindqkalyani123", Keys.TAB);
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'s-new-message')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@class='v-EmailInput-input'])[1]")).sendKeys("arakotakalyani92@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='v-TextInput-input'])[3]")).sendKeys("test");
		
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("(//button[contains(@class,'MenuButton')])[5]"));
		e.click();
		 e.findElement(By.xpath("following::ul/child::li[1]")).click();
			Thread.sleep(2000);
		 StringSelection s=new StringSelection("C:\\Users\\arako\\OneDrive\\Desktop\\Java tutorial.txt");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 //r.delay(1000);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//div[contains(@class,'v-RichText-input')]")).sendKeys("Hi"+ '\n' + "This is new notes" +  '\n'  + "Regards," + '\n'+ "Kalyani");
		 driver.findElement(By.xpath("//button[contains(@class,'v-Button s-send v-Button--cta v-Button--sizeM v-Button')]")).click();
		 
		 System.out.println("Given data has sent successfully.");
		
		}
		}
	
		



