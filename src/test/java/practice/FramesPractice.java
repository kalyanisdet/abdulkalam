package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPractice {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("iframewrapper");
		driver.findElement(By.xpath("//input[@value='Click me']")).click();
		driver.switchTo().alert().accept();
		
		WebElement e=driver.findElement(By.xpath("//p[text()=' Click the following button to see the effect ']"));
		String x=e.getText();
		System.out.println(x);
	
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

	}

}
