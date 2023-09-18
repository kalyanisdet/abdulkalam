package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppSpot {
	RemoteWebDriver driver;
	@Test
	public void app() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']")).getShadowRoot()
		.findElement(By.id("input")).sendKeys("abdul");
		
	}

}
