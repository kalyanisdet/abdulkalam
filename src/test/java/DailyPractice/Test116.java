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

public class Test116 {
	RemoteWebDriver driver;
	@Test(priority=0)
	public void coveredEle() throws Exception {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	//Launch site 
	driver.get("http://www.flipkart.com");
	Thread.sleep(5000);
	//locate element
	WebElement e=driver.findElement(By.xpath("//button[@type='submit']"));
	//get screenshot of element covered by banner
	File dest1=new File("target\\coveredelementpic.png"); 
	File src1=e.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,dest1); //banner screenshot as per target element size
	//close banner
	driver.findElement(By.xpath(
			"(//span[text()='Login'])[1]/preceding::button[1]")).click();
	Thread.sleep(5000);
	//take screenshot of an element after closing banner
	File dest2=new File("target\\notcoveredelementpic.png"); 
	File src2=e.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src2,dest2); //element screenshot as per that element size
		
		
				}
	}


