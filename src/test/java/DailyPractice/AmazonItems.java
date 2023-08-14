package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonItems {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement enteriteminsearch=driver.findElement(By.id("twotabsearchtextbox"));
		
		enteriteminsearch.sendKeys("mobiles",Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		Thread.sleep(5000);
		enteriteminsearch.sendKeys(Keys.ENTER);
		

	}

}
