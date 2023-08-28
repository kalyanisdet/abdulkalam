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

public class FramesPractice25 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.fastmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='header-nav-link']/strong")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("magnitia123456@fastmail.com",Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@class,'s-new-message')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//textarea[@class='v-EmailInput-input'])[1]")).sendKeys("kalyanimindq123@fastmail.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='v280-subject-input']")).sendKeys("Practice sending mails");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@aria-label='Body']")).sendKeys("Hello \n , I am learning new concepts and frameworks in Selenium \n , Thanks \n , Kalyani.");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='v176']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='v-MainNavToolbar']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://app.fastmail.com");
		//driver.findElement(By.xpath("//a[@class='header-nav-link']/strong")).click();
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("kalyanimindq123@fastmail.com",Keys.TAB);
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		Thread.sleep(5000);
		String y=driver.findElement(By.xpath("//ul[contains(@class,'Mailbox')]/li[1]/a/div/span/span")).getAttribute("title");
		if(y.equals("magnitia123456@fastmail.com")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		Thread.sleep(5000);
		String z=driver.findElement(By.xpath("//ul[contains(@class,'Mailbox')]/descendant::li[1]/descendant::div[4]")).getAttribute("title");
		if(z.equals("Practice sending mails")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		Thread.sleep(5000);
		String a=driver.findElement(By.xpath("//ul[contains(@class,'Mailbox')]/li[1]/a/div[contains(text(),'Hello , I am learning')]")).getText();
		if(a.equals("Hello , I am learning new concepts and frameworks in Selenium , Thanks , Kalyani.")) {
			System.out.println("Test passed");
			
		}
		else
		{
			System.out.println("Test failed");
			
		}
		Thread.sleep(5000);
		/*
		 * String b=driver.findElement(By.xpath(
		 * "//ul[contains(@class,'Mailbox')]/li[1]/a/div[6]")).getAttribute("title");
		 * if(b.equals("5:13 PM")) { System.out.println("Test passed"); } else {
		 * System.out.println("Test failed"); }
		 */
		//Mail is read or unread, How can we know using code.
		/*
		 * WebElement webEle=driver.findElement(By.xpath(
		 * "//ul[contains(@class,'Mailbox')]/descendant::li[1]/a/descendant::div[2]/child::span"
		 * )); if(webEle.)
		 */
		/*
		 * List<WebElement> list=driver.findElements(By.xpath(
		 * "//ul[contains(@class,'Mailbox')]/descendant::li/a")); for(int
		 * i=0;i<=list.size();i++) { list.get(i).click(); }
		 * driver.findElement(By.xpath("//span[text()='Delete']/parent::button")).click(
		 * );
		 */
		driver.findElement(By.xpath("//*[@id=\"v120\"]/div[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@type='button']/*[local-name()='svg'])[last()-1]")).click();
		
		
		
		
			
		}
	
		}
			


