package JavaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuLeftRight {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e=driver.findElement(By.xpath("(//span[text()='Menu'])[2]"));
		e.click();
		
		WebElement a =e.findElement(By.xpath("//div[@class='menu transition visible']/child::div[2]"));
		driver.executeScript("arguments[0].scrollIntoView();", a);
		a.click();
		
		
		
		/*
		 * WebElement f=e.findElement(By.
		 * xpath("child::div[@class='right menu transition visible']/div[1]"));
		 * f.click();
		 */
			driver.switchTo().activeElement().findElement(By.xpath("child::div[@class='right menu transition visible']/div[1]")).click();

	}
}
