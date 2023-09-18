package SeleniumTests;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test121 {
	RemoteWebDriver driver;
	@Test
	public void settings() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings/");
		Thread.sleep(2000);
		/*
		 * driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		 * .findElement(By.id("toolbar")).getShadowRoot()
		 * .findElement(By.id("search")).getShadowRoot()
		 * .findElement(By.id("searchInput")).sendKeys("abdul");
		 */
		WebElement e=driver.findElement(By.tagName("settings-ui"));
		SearchContext x=e.getShadowRoot();
		WebElement e2=x.findElement(By.id("toolbar"));
		SearchContext x1=e2.getShadowRoot();
		WebElement e3=x1.findElement(By.id("search"));
		SearchContext x2=e3.getShadowRoot();
		x2.findElement(By.id("searchInput")).sendKeys("abdul");
		
		
	}

}
