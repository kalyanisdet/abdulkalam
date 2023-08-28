package javaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seletech.in/practice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement e=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(e);
		s.selectByVisibleText("Option3");
		
		

	}

}
