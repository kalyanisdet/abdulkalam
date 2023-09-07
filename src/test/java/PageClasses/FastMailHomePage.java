package PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FastMailHomePage {
	
	RemoteWebDriver driver;
	@FindBy(xpath="//button[@id='main-nav-toolbar']")
	WebElement clickOnSettings;
	
	
	
	public FastMailHomePage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSett() {
		clickOnSettings.click();
	}
	
	

}
