package PagesForElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface LoginPg {
	RemoteWebDriver driver=new ChromeDriver();
	public static WebElement clkOnAll=driver.findElement(By.xpath("//a[@aria-label='Open Menu']"));
	
	public void AllBtn();
		
	

}
