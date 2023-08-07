package Pages;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FastMailTest extends FastMailMethods{

	static RemoteWebDriver driver;
	public FastMailTest(RemoteWebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get("https://app.fastmail.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		FastMailTest fastmaintest=new FastMailTest(driver);
		fastmaintest.enterUsername("kalyanimindq123");
		fastmaintest.enterPassword("Kalyani@125$");
		fastmaintest.clickOnLoginBtn();
		

	}

}
