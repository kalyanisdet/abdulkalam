package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice3 {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement e=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		String x=e.getText();
		System.out.println(x);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='File']")).click();
		driver.findElement(By.xpath("//div[text()='New document']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body[@aria-label='Rich Text Area. Press ALT-0 for help.']/p")).sendKeys("Hi am doing frames practising.");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		
        
	}

}
