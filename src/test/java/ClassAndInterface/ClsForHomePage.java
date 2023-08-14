package ClassAndInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface ClsForHomePage {
	
	 RemoteWebDriver driver=new ChromeDriver();
	public static  WebElement LoginBtn = driver.findElement(By.linkText("Sign in"));
	 public static  WebElement Username = driver.findElement(By.name("email"));;
	 public static  WebElement ClkNxt = driver.findElement(By.xpath("//input[@type='submit']"));
	 public static  WebElement pwd = driver.findElement(By.name("password"));
	 public static  WebElement PasswordNxt = driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
	 public static  WebElement ClkOnNewReleaseTab = driver.findElement(By.linkText("New Releases")); 
	
	 public void loginButton();
		public String enterUserName(String x);
		public void clkOnNextBtn();
		public String enterPassword(String y);
		public void loginToHome();
		public void clkOnNewReleaseBtn();

}
