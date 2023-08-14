package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import Pages.HmPageBody;
import Pages.HmPage;

public class AmazonTest extends HmPageBody{
	static RemoteWebDriver driver;
	public AmazonTest(RemoteWebDriver driver) {
		super(driver);
		this.driver=driver;
	
	}
	public  void method() {



		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		AmazonTest obj= new AmazonTest(driver);
		obj.loginButton();
		obj.enterUserName("8106537416");
		obj.clkOnNextBtn();
		obj.enterPassword("8106537416");
		obj.loginToHome();
		obj.clkOnNewReleaseBtn();


	}

}


