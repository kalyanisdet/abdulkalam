package ClassAndInterface;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClsHomePage implements ClsForHomePage{
 

public void loginButton() {
	LoginBtn.click();
	
}
public String enterUserName(String x) {
	Username.sendKeys(x);
	return x;

}
public void clkOnNextBtn() {
	ClkNxt.click();
}
public String enterPassword(String y) {
	pwd.sendKeys(y);
	return y;
}
public void loginToHome() {
	PasswordNxt.click();
}
public void clkOnNewReleaseBtn() {
	ClkOnNewReleaseTab.click();
}
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.in");
	
	ClsHomePage obj=new ClsHomePage();
	obj.loginButton();
	obj.enterUserName("8106537416");
	obj.clkOnNextBtn();
	obj.enterPassword("8106537416");
	obj.loginToHome();
	obj.clkOnNewReleaseBtn();
	
	
}
	
}




