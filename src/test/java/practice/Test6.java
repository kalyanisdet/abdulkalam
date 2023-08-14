package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {
	public String baseUrl="http://www.amazon.in";
	public WebDriver driver;
	
	
	@Test(priority=0)
	public void method1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("8106537416", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("8106537416", Keys.ENTER);
		}
	@Test(priority=1)
	public void homePage() {
		
		driver.findElement(By.xpath("//a[@aria-label='Open Menu']")).click();
		
	}
	
	
	
	
		
		
		
		
	

}
