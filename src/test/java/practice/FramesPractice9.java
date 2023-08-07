package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice9 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("iamframe");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Selenium");
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement webelement=driver.findElement(By.xpath("//select[@id='animals']"));
		Select select=new Select(webelement);
		select.selectByIndex(1);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iamframe");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).clear();
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println("All actions are successfully done.");
		
	}
}
