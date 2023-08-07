package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HmPageBody implements HmPage{

RemoteWebDriver driver;
public HmPageBody(RemoteWebDriver driver) {
	this.driver=driver;
}
	public  void loginButton() {
		 WebElement LoginBtn=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		LoginBtn.click();
	}
	public   void enterUserName(String x) {
		WebElement Username=driver.findElement(By.name("email"));
		Username.sendKeys(x);
	}
	public   void clkOnNextBtn() {
		WebElement ClkNxt=driver.findElement(By.xpath("//input[@type='submit']"));
		ClkNxt.click();

	}
	public   void enterPassword(String y) {
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys(y);
	}
	public   void loginToHome() {
		WebElement PasswordNxt=driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		PasswordNxt.click();
	}
	public   void clkOnNewReleaseBtn() {
		WebElement ClkOnNewReleaseTab=driver.findElement(By.linkText("New Releases"));
		ClkOnNewReleaseTab.click();
	}




}


