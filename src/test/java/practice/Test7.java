package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().browserVersion("112").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("dineshsf827@gmail.com");

		driver.findElement(By.name("pw")).sendKeys("Test@12345",Keys.ENTER);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@title='Search Setup']")).sendKeys("A", Keys.DOWN);












	}
}