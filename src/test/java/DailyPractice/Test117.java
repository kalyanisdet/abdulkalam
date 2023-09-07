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

public class Test117 {
	RemoteWebDriver driver;
	@Test(priority=0)
	public void coveredEle() throws Exception {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Launch site 
	driver.get("http://www.flipkart.com");
	Thread.sleep(2000);
	//locate element
	WebElement searchMagnifiedIcon=driver.findElement(By.xpath("//button[@type='submit']"));
	Thread.sleep(1000);
	File dest1=new File("target//UncoveredElement.png");
	File src1=searchMagnifiedIcon.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, dest1);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Login']/preceding::button[1]")).click();
	Thread.sleep(1000);
		File dest2=new File("target//coveredElement.png");
		File src2=searchMagnifiedIcon.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, dest2);
		
				}
	}


