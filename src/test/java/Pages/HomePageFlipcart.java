package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePageFlipcart implements LoginPageFlipcart {
	RemoteWebDriver driver;
	public HomePageFlipcart(RemoteWebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void closeLoginPopup() {
		WebElement loginBtn=driver.findElement(By.xpath("//span[text()='Login']/preceding::*[@class='_2KpZ6l _2doB4z']"));
		try {
			loginBtn.click();
		}
		catch(Exception exception) {
			System.out.println("Not clicked");
		}
	}
	public void clickOnBeauty() {
		WebElement clkOnBeauty=driver.findElement(By.xpath("//div[text()='Beauty']/ancestor::div[@class='eFQ30H']"));
		clkOnBeauty.click();
	}

}
