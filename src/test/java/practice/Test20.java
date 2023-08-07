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

public class Test20 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Abdul kalam");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement e=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(e);
		s.selectByVisibleText("Avatar");
		driver.switchTo().defaultContent();
		TakesScreenshot takesScr=(TakesScreenshot)driver;
		File f=takesScr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\arako\\OneDrive\\Pictures\\Screenshots\\CherTech.jpg"));
		
		
	}

}
