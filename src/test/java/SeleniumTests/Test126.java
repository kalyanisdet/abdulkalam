package SeleniumTests;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test126 {
	RemoteWebDriver driver;
	@Test
	public void settings() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		//close banner if exists
		try
		{
			driver.findElement(By.xpath(
					"(//span[text()='Login'])[1]/preceding::button[1]")).click();
			Thread.sleep(5000);
		}
		catch(Exception ex)
		{
			System.out.println("No banner for this time");
		}
		//click on "mobiles" link
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(5000);
		//click on "Shop Now" for 1st product
		driver.findElement(By.xpath("//p[text()='Realme']")).click();
		Thread.sleep(5000);
		int pno=2;
		while(true) {
			try {
				driver.findElement(By.linkText(""+pno)).click();
				Thread.sleep(2000);
				pno++;
				
			}
			catch(Exception excep) {
				break;
			}
			
		}
		
		
	}
}