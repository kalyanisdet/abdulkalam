package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice5 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("chrome://settings/help");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("settings-ui")).getShadowRoot().findElement(By.id("toolbar")).getShadowRoot()
		.findElement(By.id("search")).getShadowRoot()
		.findElement(By.id("searchInput")).sendKeys("Abdul kalam sir");
		
		
		
	}

}
