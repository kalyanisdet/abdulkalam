package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FastMailTest {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fastmail.com/mail/Inbox/?u=a9c14066");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.linkText("Log in as another user")).sendKeys("Log in as another user");
		driver.findElement(By.name("username")).sendKeys("kalyanimindq123@fastmail.com");
		driver.findElement(By.name("password")).sendKeys("Kalyani@125$");
		driver.findElement(By.xpath("//span[text()='Log in']/parent::button")).click();
		
	}
	

}
