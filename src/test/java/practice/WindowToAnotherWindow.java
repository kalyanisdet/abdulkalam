package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowToAnotherWindow {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Get Certified")).click();
		Set<String> s=driver.getWindowHandles();
		List<String> l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Create Website")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Get Started for Free")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		
		
		
		
	}

}
