package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FastMailMethods implements FastMailLoginPage {
	RemoteWebDriver driver;
	public FastMailMethods(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public void enterUsername(String x) {
		WebElement un=driver.findElement(By.name("username"));
		un.sendKeys(x);
	}
	public void enterPassword(String y) {
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys(y);
	}
	public void clickOnLoginBtn() {
		WebElement loginBtn=driver.findElement(By.xpath("(//button[contains(@class,'Button')])[2]"));
		loginBtn.click();
		
	}

}
