package SeleniumTests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test124 {
	RemoteWebDriver driver;
	@Test
	public void settings() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		//close banner if exists
		WebElement e=driver.findElement(By.xpath("(//input[@type='text'])[2]/preceding::button[1]"));
		try {
			
			e.click();
		}
		catch(Exception ex) {
			driver.executeScript("arguments[0].click();", e);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_37M3Pb']/child::div[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[text()='Realme']")).click();
		
		
		
		Thread.sleep(5000);
		
		while(true) {
			try {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(2000);
			}
			
			catch(Exception exe) {
				
			}
		}
		
		
	}

		
		
	}


