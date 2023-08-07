package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		driver.findElement(By.name("email")).sendKeys("8106537416", Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("8106537416", Keys.ENTER);
		driver.manage().window().maximize();
		
		
	}

}
