package DailyPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHub {
@Test
	public void loginToSelectorsHub() throws Exception {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("pact");
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.id("snacktime"));
		
		SearchContext sh=e.getShadowRoot();
		WebElement testerFood=sh.findElement(By.linkText("Testers Food"));
		Thread.sleep(2000);
		try {
		testerFood.click();
		}
		catch(JavascriptException ee) {
			driver.executeScript("arguments[0].click();", testerFood);
		}
		
		

	}

}
