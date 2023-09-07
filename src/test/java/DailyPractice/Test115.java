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

public class Test115 {
	RemoteWebDriver driver;
	@Test(priority=0)
	
	public void hidden() throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		//Launch site and locate an hidden element
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		WebElement hidden=driver.findElement(By.xpath("//input[@name='lname']"));
		Thread.sleep(2000);

		File  src=hidden.getScreenshotAs(OutputType.FILE);
		File dest=new File("target//w3schools.png");
		FileHandler.copy(src, dest);
		
				}
	}


