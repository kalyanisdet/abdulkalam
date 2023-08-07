package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithShadow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.tagName("settings-ui")).getShadowRoot().
		findElement(By.id("toolbar")).getShadowRoot()
		.findElement(By.id("search")).getShadowRoot()
		.findElement(By.id("searchInput")).sendKeys("Abdul");
		

	}

}
