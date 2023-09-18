package SeleniumTests;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123 {
	RemoteWebDriver driver;
	@Test
	public void settings() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		//close banner if exists
		try
		{
			//span[text()='Login'])[1]/preceding::button[1]
			////span[text()='Login']/preceding::span[@role='button']
			driver.findElement(By.xpath(
					"(//span[text()='Login']/preceding::span[@role='button']")).click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			System.out.println("No banner for this time");
		}
		//click on "mobiles" link
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(5000);
		//click on "Shop Now" for 1st product
		driver.findElement(By.xpath("//p[text()='Realme']")).click();
		Thread.sleep(5000);
		//pagination
		while(true)
		{
			//goto next page if exists by clicking on Next link
			try
			{
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				break; //terminate from loop
			}
		}
		//close site
		//driver.close();
	}

		
		
	}

