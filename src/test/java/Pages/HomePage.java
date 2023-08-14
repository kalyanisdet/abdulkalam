package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends LoginPage{
	 public RemoteWebDriver driver;
	 @FindBy(linkText="All")
	 WebElement clkOnAllBtn;
	 
	public HomePage(RemoteWebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clkOnAllBtnHm() {
		clkOnAllBtn.click();
		
	}
}
