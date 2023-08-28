package Pages;



import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LoginPage {
	RemoteWebDriver driver;
	@FindBy(linkText="Sign in")
	WebElement LoginBtn;
	@FindBy(name="email")
	WebElement Username;
	@FindBy(xpath="//input[@type='submit']")
	WebElement ClkNxt;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	WebElement PasswordNxt;
	@FindBy(linkText="New Releases")
	WebElement ClkOnNewReleaseTab; 
	@FindBy(xpath="//span[text()='Amazon Hot New Releases']")
	WebElement ClkOnTab;
	

	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void clkOnLoginBtn() {
		LoginBtn.click();
	}
	public void user(String x ) {
		Username.sendKeys(x);
	}

	public void clkOnNext() {
		ClkNxt.click();
	}

	public void pass(String y) {
		pwd.sendKeys(y);
	}

	public void passwordNxt() throws Exception  {
		PasswordNxt.click();
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File f=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\arako\\eclipse-workspace\\Vnktswara\\homepageScreenshot.jpg"));
		System.out.println("Screenshot captured successfully.");

	}
	public void newReleaseTab() throws Exception{ 
		ClkOnNewReleaseTab.click();
		Thread.sleep(2000);	
	}
		public void getOnReleaseTitle() {
		  String actual=ClkOnTab.getText(); 
		  String Expected="Amazon Hot New Releases"; 
		  Assert.assertEquals(Expected, actual);
		  System.out.println("Actual and expected result matched: " +actual);
		  
		 
		} 
}

