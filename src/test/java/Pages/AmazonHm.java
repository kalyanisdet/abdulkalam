package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonHm {
	public RemoteWebDriver driver;
	public void browserName(String browseNm) {
		if(browseNm.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		if(browseNm.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		if(browseNm.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
	}
	
	public void url(String siteurl) {
		driver.get(siteurl);
	}
	/*
	 * public void clkOnLogin() {
	 * driver.findElement(By.xpath("//input[@value='Click me']")).click(); }
	 */
}
