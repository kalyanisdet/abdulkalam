package DailyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test107 {

	@Test
	public void textBoxDisplayMeth() throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		//Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='javascript']"));
		if(checkbox.isDisplayed()) {
			System.out.println("Checkbox is displayed");
		
		
		if(checkbox.isEnabled()) {
			System.out.println("Checkbox is enabled");
		
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("Checkbox selected successfully.");
		}
		
		else {
			System.out.println("checkbox not checked successfully.");
		}
		
		
		}
		else {
			System.out.println("Checkbox not enabled");
		}
		
	}
		else {
			System.out.println("Checkbox is not displayed.");
		}
}
}