package Tests;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmaTest extends HomePage{

	
	public AmaTest(RemoteWebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method 
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		HomePage obj=new HomePage(driver);
		obj.clkOnLoginBtn();
		obj.user("8106537416");
		obj.clkOnNext();
		obj.pass("8106537416");
		obj.passwordNxt();
		obj.newReleaseTab();
		Thread.sleep(2000);
		obj.getOnReleaseTitle();
		obj.clkOnAllBtnHm();
		System.out.println("All button successfully clicked.");

	}

}
