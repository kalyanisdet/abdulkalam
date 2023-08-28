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

public class Test32 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.name("mytext1")).sendKeys("practice");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("practice");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("practice");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//div[@class='bzfPab wFGF8'])[3]")).click();
		driver.findElement(By.xpath("//input[@aria-label='Other response']")).sendKeys("For clearance");
		driver.findElement(By.xpath("//span[text()='Clear selection']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Web Testing']")).click();
		driver.findElement(By.xpath("//div[@aria-label='General Web Automation']")).click();
		/*
		 * WebElement webelemnet=driver.findElement(By.xpath("//div[@role='option']"));
		 * Select select=new Select(webelemnet); select.selectByIndex(1);
		 */
		
driver.findElement(By.xpath("//span[text()='Next']")).click();
/*
 * driver.switchTo().frame(3);
 * 
 * driver.findElement(By.xpath("(//div[text()='Your answer'])[1]")).
 * sendKeys("Very Useful app");
 * driver.findElement(By.xpath("(//div[text()='Your answer'])[2]")).
 * sendKeys("Very Useful app");
 */
driver.findElement(By.xpath("//span[text()='Submit']")).click();
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();
driver.switchTo().frame(3);
driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("practice");
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();
TakesScreenshot tScr=(TakesScreenshot)driver;
File file=tScr.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\frames.jpg"));

	}
}
