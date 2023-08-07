package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3chools.com/tags/tryit.asp?filename=tryhtml5_input_type_file");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.name("myfile")).sendKeys("C:\\Users\\arako\\OneDrive\\Pictures\\Screenshots\\Screenshot (4).png");
		
		
		driver.findElement(By.xpath("(//input[@type='submit'])[last()-1]")).click();
		
		
		driver.switchTo().defaultContent();
	}

}
