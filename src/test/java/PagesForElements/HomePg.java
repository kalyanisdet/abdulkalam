package PagesForElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface HomePg{
	RemoteWebDriver driver=new ChromeDriver();
	 public static WebElement selectNewReleases=driver.findElement(By.xpath("(//a[text()='New Releases'])[last()-1]"));
	 
	 
	 public void selectNewRelase();

}
