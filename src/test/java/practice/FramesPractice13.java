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

public class FramesPractice13 {

	public static void main(String[] args) throws Exception{
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("pact");
		WebElement e=driver.findElement(By.id("snacktime"));
		SearchContext s=e.getShadowRoot();
		WebElement target=s.findElement(By.linkText("Testers Food"));
		Thread.sleep(3000);
		try {
			target.click();
		}
		catch(Exception exception) {
			driver.executeScript("arguments[0].click();", target);
		}
		
		Set<String> set=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(set);
		driver.switchTo().window(list.get(0));
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Donate")).click();
		
	}
}

