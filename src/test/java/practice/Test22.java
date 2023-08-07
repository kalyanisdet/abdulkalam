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

public class Test22 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("toolbar")).getShadowRoot()
		.findElement(By.id("search")).getShadowRoot()
		.findElement(By.id("searchInput")).sendKeys("abdul kalam");
		
		
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("main")).getShadowRoot()
		.findElement(By.xpath("//a[text()='Google Chrome help']")).click();
		
	}

}
