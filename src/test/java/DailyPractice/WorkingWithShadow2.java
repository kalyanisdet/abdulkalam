package DailyPractice;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithShadow2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("chrome://settings/performance");
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("toolbar")).getShadowRoot()
		.findElement(By.id("search")).getShadowRoot()
		.findElement(By.id("searchInput")).sendKeys("Abdul");
		
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("toolbar")).getShadowRoot()
		.findElement(By.id("search")).getShadowRoot()
		.findElement(By.id("clearSearch")).getShadowRoot()
		.findElement(By.id("icon")).click();
		
		
		
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("leftMenu")).getShadowRoot()
		.findElement(By.id("performance")).click();
		
		
		
		driver.findElement(By.tagName("settings-ui")).getShadowRoot()
		.findElement(By.id("main")).getShadowRoot()
		.findElement(By.className("cr-centered-card-container")).getShadowRoot()
		.findElement(By.id("performanceSettingsSection")).getShadowRoot()
		.findElement(By.id("feedback")).getShadowRoot()
		.findElement(By.id("icon")).click();
	
		
		//WebElement e=driver.findElement(By.xpath("//div[@id='content-pane']/child::textarea[@id='description-text']"));
		try {
		driver.findElement(By.xpath("//input[@id='attach-file']")).sendKeys("C:\\Users\\arako\\OneDrive\\Pictures\\Screenshots\\Screenshot (396).png");
		}
		catch(Exception ex) {
			
		}
		driver.findElement(By.id("cancel-button")).click();
		

	}

}
