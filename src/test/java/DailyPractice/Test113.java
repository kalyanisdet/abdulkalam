package DailyPractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test113 {
	RemoteWebDriver driver;
	@Test(priority=0)
	
	public void hidden() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		//Launch site and locate an hidden element
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//img[@alt='Google']"));
		File src=e.getScreenshotAs(OutputType.FILE);
		File dest=new File("target//myele.png");
		FileHandler.copy(src, dest);
	}
		
		@Test(priority=1)
		public void faceb() throws Exception {
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		WebElement e2=driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Thread.sleep(2000);
		File src1=e2.getScreenshotAs(OutputType.FILE);
		File src2=new File("target//facebook.png");
		FileHandler.copy(src1, src2);
		}
	}


