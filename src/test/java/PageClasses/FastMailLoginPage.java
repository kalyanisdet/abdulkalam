package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FastMailLoginPage {
	
	RemoteWebDriver driver;
	
	@FindBy(name="username")
	WebElement uname;
	@FindBy(name="current-password")
	WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
	public FastMailLoginPage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUname(String un) {
		uname.sendKeys(un);
	}
	
	
	public void enterPwd(String pw) {
	pwd.sendKeys(pw);
	}
	
	public void loginBotton() {
	loginBtn.click();
	}
}
