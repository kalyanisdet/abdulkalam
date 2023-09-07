package DailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test106 {

	@Test
	public void textBoxDisplayMeth() throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement win=driver.findElement(By.xpath("//div[@class='QlyBfb']/child::button"));
		try {
			win.isDisplayed();
		}
		
		catch(Exception e) {
			driver.executeScript("arguments[0].click();", win);
		}
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.name("q"));
		if(e.isDisplayed()) {
			System.out.println("Element is visible");
		}
		else {
			System.out.println("Element is not visible");
		}
	}

}
