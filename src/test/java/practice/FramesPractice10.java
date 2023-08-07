package practice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice10 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.switchTo().frame("pact");
	
		WebElement e=driver.findElement(By.id("snacktime"));
	
		SearchContext searchContext=e.getShadowRoot();
		WebElement e1=searchContext.findElement(By.linkText("Testers Food"));
		try {
		
		
		e1.click();
		}
		catch(Exception ex) {
			driver.executeScript("arguments[0].click();", ex);
		}
		
	}
}
