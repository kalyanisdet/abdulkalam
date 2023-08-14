import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass3 {
	
	@Test
	public void loginMethod() throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fastmail.com/login/");
		Thread.sleep(1000);
		
		driver.switchTo().activeElement().sendKeys("mindqkalyani123", Keys.TAB);
		Thread.sleep(1000);
		driver.switchTo().activeElement().sendKeys("Kalyani@125$",Keys.ENTER);
		System.out.println("Successfully");
	}

}
