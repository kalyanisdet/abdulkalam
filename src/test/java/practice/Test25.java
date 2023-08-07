package practice;




import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test25 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("iamframe");
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Abdul kalam");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		List<WebElement> selectOption=driver.findElements(By.xpath("//select[@id='animals']/child::option"));
	
		for(int i=0;i<=3;i++) {
			
			System.out.println(selectOption.get(i).getText());
			
		}
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		/*
		 * TakesScreenshot takesScreenshot=(TakesScreenshot)driver; File
		 * file=takesScreenshot.getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(file, new
		 * File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\chercher.jpg"));
		 * System.out.println("Screenshot captured successfully.")
		 */;
		
	}

}
