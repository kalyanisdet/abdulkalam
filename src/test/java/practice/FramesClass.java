package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup(); 
		 RemoteWebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		  driver.get("https://chercher.tech/practice/frames");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.switchTo().frame("frame1");
		 driver.findElement(By.tagName("input")).sendKeys("frame");
		
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("frame2");
		 new Select(driver.findElement(By.xpath("//select[@id='animals']"))).selectByIndex(3);
		 driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		 driver.close();
		 
		 
		 
		 
		 

	}

}
