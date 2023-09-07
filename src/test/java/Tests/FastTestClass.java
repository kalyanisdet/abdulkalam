package Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import PageClasses.FastMailHomePage;
import PageClasses.FastMailLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FastTestClass {

	@Test
	public void TestCls() throws Exception{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://app.fastmail.com/login/");
		Thread.sleep(1000);
		FastMailLoginPage obj=new FastMailLoginPage(driver);
		Thread.sleep(1000);
		obj.enterUname("kalyanimindq123@fastmail.com");
		Thread.sleep(1000);
		obj.enterPwd("Kalyani@125$");
		obj.loginBotton();
		Thread.sleep(1000);
		FastMailHomePage obj2=new FastMailHomePage(driver);
		obj2.clickSett();
		
	}
	
	

}
