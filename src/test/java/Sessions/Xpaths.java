package Sessions;

import java.io.File;

import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths {
@Test
	public void ScreenCaptureTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://w3schools.com");
		driver.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
		String x=driver.getTitle();
		System.out.println(x);
		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\w3schools.jpg"));
		System.out.println("Captured screenshot successfully.");
		driver.quit();
	}

}
