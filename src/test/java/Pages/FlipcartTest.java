package Pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipcartTest extends HomePageFlipcart{

	public FlipcartTest(RemoteWebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	
	FlipcartTest flipcart=new FlipcartTest(driver);
	flipcart.closeLoginPopup();
	Thread.sleep(5000);
	flipcart.clickOnBeauty();
	}

}
