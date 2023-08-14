package practice;



import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice11 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		driver.switchTo().frame("pact");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.id("snacktime"));
		Thread.sleep(2000);
		SearchContext shadowEle=e.getShadowRoot();
		WebElement targetEle=shadowEle.findElement(By.linkText("Testers Food"));
		Thread.sleep(5000);
		try {
			targetEle.click();
		}
		catch(Exception ex) {
			driver.executeScript("arguments[0].click();", targetEle);
			
		}
		
		
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("pact");
		driver.findElement(By.id("snacktime")).getShadowRoot().findElement(By.name("chai")).sendKeys("Irani");
		
	}
}
